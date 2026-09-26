class Box {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length <= 0) {
            System.out.println("Invalid!");
        } else {
            this.length = length;
        }
    }
}

class privateexc1 {
    public static void main(String[] args) {
        Box b = new Box();
        b.setLength(10);
        System.out.println(b.getLength());
        b.setLength(-5);
        System.out.println(b.getLength());
    }
}