public class HomeworkTracker {

        private String name;
        private int total;
        private int completed;

        public HomeworkTracker(String name, int total, int completed) {
            name = name;
            this.total = total;
            this.completed = completed;
        }

        public String getProgress() {
            return "Subject: " + name + " | Total: " + total + " | Completed: " + completed;
        }
        public boolean isDone() {
            if(total == 0) {
                return true;
            }
            else {
                return false;
            }
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
        HomeworkTracker a = new HomeworkTracker("History", 10, 1);
        HomeworkTracker b = new HomeworkTracker("Math", 15, 4);
        b.completeProblems(b, 3);
        a.completeProblems(a, 2);
        System.out.println(a.getProgress());
        System.out.println(b.getProgress());
    }
}

