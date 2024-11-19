package javaStringMethods;


           public class Substring {

                       String str1 = "java is fun";
                       public void extractSubstring() {
                           System.out.println("\nExtracting, Finding and Checking Substring");

                       // extract substring from index 0 to 3
                       System.out.println(str1.substring(0, 4));
                   }


               public void findString() {
                       String str1 = "Java is fun";
                       int result;

                       // getting index of character 's'
                       result = str1.indexOf('s');

                       System.out.println(result); // 6

                       // getting index of character 'J'
                       result = str1.lastIndexOf('J');
                       System.out.println(result); // 0

                       // the last occurrence of 'a' is returned
                       result = str1.lastIndexOf('a');
                       System.out.println(result); // 3

                       // character not in the string
                       result = str1.lastIndexOf('j');
                       System.out.println(result); // -1

                       // getting the last occurrence of "ava"
                       result = str1.lastIndexOf("ava");
                       System.out.println(result); // 1

                       // substring not in the string
                       result = str1.lastIndexOf("java");
                       System.out.println(result); // -1
                   }


                        public void isContentPresent(){

                       String str1 = "Learn Java";
                       Boolean result;

                       // check if str1 contains "Java"
                       result = str1.contains("Java");
                       System.out.println(result);  // true

                       // check if str1 contains "Python"
                       result = str1.contains("Python");
                       System.out.println(result);  // false

                       // check if str1 contains ""
                       result = str1.contains("");

                       System.out.println(result);  // true
                   }



           }