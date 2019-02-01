public class Person {
    // Declaring variables
    private String _eyeColor;
    private int _length;
    private int _age;
    private String _name;
    private String _country;
    private int _bsn;

    // Valid eye colors
    private String[] eyeColors = {"red","blue","green","brown","white"};

    // Fetching CountryList
    CountryList countries = new CountryList();

    public Person(String eyeColor, int length, int age, String name, String country, int bsn) {
        setEyeColor(eyeColor);
        setLength(length);
        setAge(age);
        setName(name);
        setCountry(country);
        setBsn(bsn);
    }

    public void setEyeColor(String value) {
        value = value.toLowerCase();
        for (int i = 0;i < eyeColors.length;i++) {
            if (value.equals(eyeColors[i])) {
                _eyeColor = value;
                i = eyeColors.length;
            }
        }
    }

    public String getEyeColor() {
        return _eyeColor;
    }

    public void setLength(int value) {
        if (value > 50 && value < 250) {
            _length = value;
        }
    }

    public double getLength() {
        return _length;
    }

    public void setAge(int value) {
        if (value >= 0 && value < 110) {
            _age = value;
        }
    }

    public int getAge() {
        return _age;
    }

    public void setName(String value) {
        String[] valueSplit = value.split(" ");
        if (valueSplit.length < 3) {
            _name = value;
        }
    }

    public String getName() {
        return _name;
    }

    public void setCountry(String value) {
        for (int i = 0;i < countries.LIST.length;i++) {
            if (value.toLowerCase().equals(countries.LIST[i].toLowerCase())) {
                _country = value;
                i = countries.LIST.length;
            }
        }
    }

    public String getCountry() {
        return _country;
    }

    public void setBsn(int value) {
        String bsnString = Integer.toString(value);
        if (bsnString.length() == 9) {
            _bsn = value;
        }
    }

    public double getBsn() {
        return _bsn;
    }
}
