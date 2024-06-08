final class Grade {


        private String department;
        private int courseNum;
        private float percent=0F;
        private char letter='E';
        private static int instanceCount = 0 ;



        public Grade() {
            instanceCount++;
        }

        public Grade(String department, int courseNum){
            this.department = department;
            this.courseNum = courseNum;
            instanceCount++;
        }

        public Grade(String department, int courseNum, float percent){
            this.department =  department;
            this.courseNum =  courseNum;
            this.percent = percent;
            this.letter = calculateLetter(percent);
            instanceCount++;
        }

        public Grade(String department, int courseNum, char letter){
            this.department =  department;
            this.courseNum =  courseNum;
            this.letter = letter;
            this.percent = calculatePercent(letter);
            instanceCount++;
        }



        private char calculateLetter(float percent){
            char letter;
            if(percent<=100 && percent>=75){
                letter='A';
            }
            else if(percent<75 && percent>=66){
                letter= 'B';
            }
            else if(percent<66 && percent>=57){
                letter= 'C';
            }
            else if(percent<57 && percent>=50){
                letter= 'D';
            }
            else{
                letter='E';
            }
            return letter;

        }

        private float calculatePercent(char letter){
            float percent;

            switch (letter){
                case 'A':
                    percent=(float)(75+100)/2;
                    break;
                case 'B':
                    percent=(float)(66+75)/2;
                    break;
                case 'C':
                    percent=(float)(57+66)/2;
                    break;
                case 'D':
                    percent=(float)(50+57)/2;
                    break;
                default:
                    percent=(float)(50+0)/2;
                    break;
            }

            return percent;
        }

        public static int getInstanceCount(){
            return instanceCount;
        }

        public String convertToString(){

            return  department + "" + courseNum + " " + letter + " " + percent;
        }


        public String getDepartment(){
            return department;
        }

        public int getCourseNum(){
            return courseNum;
        }

        public float getPercent(){
            return percent;
        }

        public char getLetter(){
            return letter;
        }

        public static void main (String[] args){

            Grade grade1 = new Grade("LOG", 100, 'A');
            Grade grade2 = new Grade("GTI", 121, 68.5F);
            Grade grade3 = new Grade("LOG", 121);
            Grade grade4 = new Grade("LOG", 320, 'B');
            Grade grade5 = new Grade("MAT", 144, 57F);
            Grade grade6 = new Grade("MAT", 210, 'E');
            Grade grade7 = new Grade("MAT", 350, 74.99F);


            System.out.println(grade1.convertToString());
            System.out.println(grade2.convertToString());
            System.out.println(grade3.convertToString());
            System.out.println(grade4.convertToString());
            System.out.println(grade5.convertToString());
            System.out.println(grade6.convertToString());
            System.out.println(grade7.convertToString());


        }




    }

