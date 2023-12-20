package mirea__lab__4;

public class Book {
        private String name;
        private String author;
        private String data;

        public Book(String n, String a, String d){
            name = n;
            author = a;
            data = d;
        }
        public Book(){
            name = "-";
            author = "no_name";
            data = "00.00.00";
        }
        public void setName(String n) {
            this.name = n;
        }
        public void setAuthor(String a) {
            this.author = a;
        }
        public void setData(String d) {
            this.data = d;
        }
        public String getName(){
            return this.name;
        }
        public String getAuthor() {
            return this.author;
        }
        public String getData() {
            return this.data;
        }

}
