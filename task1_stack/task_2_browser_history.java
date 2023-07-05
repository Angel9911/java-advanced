package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task1_stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class task_2_browser_history {
    public static void main(String[] args) {
        // my solution
        Scanner scanner = new Scanner(System.in);

        /*ArrayDeque<String> browseUrls = new ArrayDeque<>();

        while(true){

            String input = scanner.nextLine();
            if(input.equals("back")){
                if(browseUrls.size() > 1){
                    browseUrls.pop();
                    String getLastUrl = browseUrls.peek();
                    System.out.println(getLastUrl);
                }else{
                    System.out.println("no previous urls");
                }
            } else if(input.equals("Home")) {
                browseUrls.clear();
                return;
            }else {
                if(!browseUrls.contains(input)) {
                    browseUrls.push(input);
                }
            }
        } */
        // end of my solution


        //softuni solution

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input = scanner.nextLine();
        String currentUrl = "";
        while (!input.equals("Home")){
            if(input.equals("back")){
                if(browserHistory.size() > 1){
                    browserHistory.pop();
                    currentUrl = browserHistory.peek();
                    System.out.println(currentUrl);
                }else{
                    System.out.println("no previous urls");
                }
            }else{
                browserHistory.push(input);
                currentUrl = browserHistory.peek();
                System.out.println(currentUrl);
            }
        }

    }
}
