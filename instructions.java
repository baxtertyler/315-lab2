public class instruction {
    
    public static class and {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;

        public and(String opcode, String rd, String rs, String rt) {
            this.opcode = opcode;
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
        }

        public printObj() {
            System.out.print(this.opcode + " " + this.rd + " " + this.rs + " " + this.rt);
        }
    }

    public static class or {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;

        public or(String opcode, String rd, String rs, String rt) {
            this.opcode = opcode;
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
        }

        public printObj() {
            System.out.print(this.opcode + " " + this.rd + " " + this.rs + " " + this.rt);
        }
    }

    public static class add {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;

        public add(String opcode, String rd, String rs, String rt) {
            this.opcode = opcode;
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
        }

        public printObj() {
            System.out.print(this.opcode + " " + this.rd + " " + this.rs + " " + this.rt);
        }
    }

    public static class sll {

        public String opcode;
        public String rd;
        public String rt;
        public String sa;

        public sll(String opcode, String rd, String rt, String sa) {
            this.opcode = opcode;
            this.rd = rd;
            this.rt = rt;
            this.sa = sa;
        }

        public printObj() {
            System.out.print(this.opcode + " " + this.rd + " " + this.rt + " " + this.sa);
        }
    }

    public static class slt {

        public String opcode;
        public String rd;
        public String rs;
        public String rt;

        public slt(String opcode, String rd, String rs, String rt) {
            this.opcode = opcode;
            this.rd = rd;
            this.rs = rs;
            this.rt = rt;
        }

        public printObj() {
            System.out.print(this.opcode + " " + this.rd + " " + this.rs + " " + this.rt);
        }
    }

    public static class jr {

        public String opcode;
        public String rs;

        public jr(String opcode, String rs) {
            this.opcode = opcode;
            this.rs = rs;
        }

        public printObj() {
            System.out.print(this.opcode + " " + this.rs);
        }
    }

}