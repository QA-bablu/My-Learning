package objectorientedconcepts;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperations {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int T = scanner.nextInt(); // Number of test cases
		        scanner.nextLine(); // Consume newline

		        for (int t = 0; t < T; t++) {
		            int Q = scanner.nextInt(); // Number of queries
		            scanner.nextLine(); // Consume newline

		            TreeMap<Integer, Integer> treeMap = new TreeMap<>(); // TreeMap to store key-value pairs

		            for (int q = 0; q < Q; q++) {
		                String[] query = scanner.nextLine().split(" ");
		                char operation = query[0].charAt(0);

		                switch (operation) {
		                    case 'a':
		                        int key = Integer.parseInt(query[1]);
		                        int value = Integer.parseInt(query[2]);
		                        treeMap.put(key, value);
		                        break;
		                    case 'b':
		                        int searchKey = Integer.parseInt(query[1]);
		                        int resultB = treeMap.containsKey(searchKey) ? treeMap.get(searchKey) : -1;
		                        System.out.print(resultB + " ");
		                        break;
		                    case 'c':
		                        int size = treeMap.size();
		                        System.out.print(size + " ");
		                        break;
		                    case 'd':
		                        int removeKey = Integer.parseInt(query[1]);
		                        treeMap.remove(removeKey);
		                        break;
		                    case 'e':
		                        for (int mapKey : treeMap.keySet()) {
		                            System.out.print("(" + mapKey + "," + treeMap.get(mapKey) + ") ");
		                        }
		                        break;
		                }
		            }
		            System.out.println(); // Print newline after each test case
		        }

		        scanner.close();
		    }
		}
