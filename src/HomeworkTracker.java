public class HomeworkTracker {

        private String name;
        private int total;
        private int completed;

        public HomeworkTracker(String name, int total, int completed) {
            this.name = name;
            this.total = total;
            this.completed = completed;
        }

        public void completeProblems(HomeworkTracker a, int numCompleted){

            if(numCompleted <= a.total) {

                a.completed += numCompleted;
                a.total -= numCompleted;


            }
            else{

                a.total = 0;

            }

        }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }
}

