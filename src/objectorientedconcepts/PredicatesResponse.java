package objectorientedconcepts;

import java.util.List;
import java.util.function.Predicate;

class PredicatesResponse {
    public static void main(String[] args) {
        List<Response> responses = List.of(
            new Response("{ message: 'Success' }", 200, "JSON"),
            new Response("{ error: 'Not Found' }", 404, "JSON"),
            new Response("{ message: 'Bad Request' }", 400, "JSON"),
            new Response("{ data: 'User details' }", 200, "XML"),
            new Response("{ message: 'Unauthorized' }", 401, "JSON")
        );

        // Predicate to check if status code is 400
        Predicate<Response> statusCode400Predicate = response -> response.getStatusCode() == 400;

        // Predicate to check if response type is JSON
        Predicate<Response> jsonResponseTypePredicate = response -> "JSON".equalsIgnoreCase(response.getResponseType());

        // Predicate to check if status code is 400 and response type is JSON
        Predicate<Response> statusCode400AndJsonPredicate = statusCode400Predicate.and(jsonResponseTypePredicate);

        // Predicate to check if status code is 400 or response type is JSON
        Predicate<Response> statusCode400OrJsonPredicate = statusCode400Predicate.or(jsonResponseTypePredicate);

        // Predicate to check if status code is not 400 and response type is JSON
        Predicate<Response> statusCodeNot400AndJsonPredicate = statusCode400Predicate.negate().and(jsonResponseTypePredicate);

        // Printing responses based on predicates
        System.out.println("Responses with status code 400:");
        printFilteredResponses(responses, statusCode400Predicate);

        System.out.println("\nResponses with response type JSON:");
        printFilteredResponses(responses, jsonResponseTypePredicate);

        System.out.println("\nResponses with status code 400 and response type JSON:");
        printFilteredResponses(responses, statusCode400AndJsonPredicate);

        System.out.println("\nResponses with status code 400 or response type JSON:");
        printFilteredResponses(responses, statusCode400OrJsonPredicate);

        System.out.println("\nResponses with status code not 400 and response type JSON:");
        printFilteredResponses(responses, statusCodeNot400AndJsonPredicate);
    }

    private static void printFilteredResponses(List<Response> responses, Predicate<Response> predicate) {
        for (Response response : responses) {
            if (predicate.test(response)) {
                System.out.println(response);
            }
        }
    }
}

