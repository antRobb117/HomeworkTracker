public class HomeworkTracker {

        private String name;
        private int assigned;
        private int completed;

        public HomeworkTracker(String name, int total, int completed) {
            this.name = name;
            this.assigned = total;
            this.completed = completed;
        }

        public String getProgress() {
            return "Subject: " + name + " | Total: " + assigned + " | Completed: " + completed;
        }
        public boolean isDone() {
            if(assigned == 0) {
                return true;
            }
            else {
                return false;
            }
        }

        public void completeProblems(HomeworkTracker a, int numCompleted){

            if(numCompleted <= a.assigned) {
                a.completed += numCompleted;
                a.assigned -= numCompleted;
            }
            else{
                a.assigned = 0;
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

