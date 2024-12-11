package generic;

public class Runner {
    public static void main(String[] args) {
            // initialize generic class
            // with String and Integer data

            GMultiDatatype<String, Integer> mobj = new GMultiDatatype("Per Scholas", 11025);

            System.out.println(mobj.getValueOne());
            System.out.println(mobj.getValueTwo());

            // initialize generic class
            // with String and String data
            GMultiDatatype<String, String> mobj2 = new GMultiDatatype("Per Scholas", "Non profit");
            System.out.println(mobj2.getValueOne());
            System.out.println(mobj2.getValueTwo());
        }

    }

