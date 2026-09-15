public class HomeworkTracker {

        private String name;
        private int total;
        private int completed;

        public HomeworkTracker(String name, int total, int completed) {
            name = name;
            this.total = total;
            this.completed = completed;
        }

        public String getName() {
            return name;
        }
        public String getProgress() {
            return "total: " + total + "completed: " + completed;
        }
        public boolean isDone() {
            if (total == 0) {
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
        a.completeProblems(a, 2);
        System.out.println(a.getProgress());
    }
}

