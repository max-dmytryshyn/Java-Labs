package interview;

public class App {

    public static void main(String[] args) {
       Interview interviewForDataScienceEngineerPosition = new Interview();
       Interview interviewForJuniorCppDeveloperPosition = new Interview("Anton Popov", 120, "Not hired", "Google Meets");
       Interview interviewWithZelenskiy = new Interview("Dmytro Gordon", 180, "3141592653 views on YouTube", "IRL",
               "Gordon's studio", "20.04.2021", true, false, "Russian's army mobilization near the ukrainian borders",
               "V Gostyakh u Gordona");

       System.out.println("First interview" + "\n" + interviewForDataScienceEngineerPosition);
       System.out.println("----------------------------");
       System.out.println("Second interview" + "\n" + interviewForJuniorCppDeveloperPosition);
       System.out.println("----------------------------");
       System.out.println("Third interview" + "\n" + interviewWithZelenskiy);
       System.out.println("----------------------------");

       Interview.printStaticInterviewCounter();
       interviewWithZelenskiy.printInterviewCounter();
    }
}
