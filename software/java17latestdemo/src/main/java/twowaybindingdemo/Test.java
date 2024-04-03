package twowaybindingdemo;



public class Test {
    public static void main(String[] args) {
        Country country=new Country();

        State state=new State();

        country.name="India";
        country.countryCode="+91";
        country.state=state;

        state.stateName="Andhra Pradesh";
        state.country=country;

        System.out.println(country.state.stateName);
    }

}
