public abstract class Telephone {
    private String myNumber;

    //    ----------------
    public abstract void call(String number);
    //    зачем переменная number объявлена как String, в телефоне будет удобнее испольозвать её как int
    public abstract boolean charge();
//    при переопределении делает проверку на наличие зарядки на телефоне или
//    подключенного питания на проводных телефонах

//  не используется - public abstract void numberTocall();

    //    ----------------

    public Telephone(String myNumber) {
        this.myNumber = myNumber;
    }
    // при определении телефона ему обязательно должен быть присвоен номер,
// вдальнейшем эту функцию можно передать сим карте
// *симку можно реализовать через абстрактный класс
    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

//    эти функции позволяют переопределить
}
