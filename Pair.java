class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object ot) {
            Pair oth = (Pair)ot;
            if(oth.x == x && oth.y == y) {
                return true;
            } else {
                return false;
            }
        }

        @Override public int hashCode() {
            return x*91 + y;
        }
}
