public class Guitar {

    private String serialNumber;

    private double price;

    /**
     * q:我理解为什么需要一个对象来让客户传输规格给search，但是为什么我焖也用此对象存储吉他的特性？
     * a:假设你只用GuitarSpec来存储客户要送给search方法的规格，
     * 并且保持Guitar类与原先一样，
     * 若要开始销售12弦吉他并且要一个numString特性，
     * 你会需要把此特性添加到Guitar与GuitarSpec类中，
     * q: 这为何是一种封装的形式？
     * a: 封装背后的思想是保护应用程序某一部分的信息免遭其他部分的干扰，在最简单的形势下，你能通过让数据私有化（private）来保护类中的数据，使之免遭应用程序其他部分的干扰
     * 然而，有时该信息可能是一整组特性（如琴弦）或行为。
     * 当你把行为从类中分解出来，你能改变该行为而无需改变该类。所以加入改变特性被存储的方式，你根本不必改变Guitar类，因为那些属性在Guitar之外被封装。
     * 通过分解出应用程序的不同部分，你能改变一部分而不需要改变整个应用程序。一般而言，你应该封装应用程序中变化可能很大的部分，让他们原理保持不变的部分
     */
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood back, Wood top) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = new GuitarSpec(builder,model,type,back,top);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
