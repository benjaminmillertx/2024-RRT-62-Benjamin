  }

        List<Object> olist = new ArrayList<>();

        Square sq = new Square() {
            @Override
            public double calculatePerimeter() {
                return 0;
            }

            public void anotherMethod() {

            }
        };

        PerimeterInterface pi = new PerimeterInterface() {
            @Override
            public double calculatePerimeter() {
                return 0;
            }

            @Override
            public int bedtime() {
                return 0;
            }
        };

        PerimeterInterface pi2 = new PerimeterInterface() {
            @Override
            public double calculatePerimeter() {
                return 100.00;
            }

            @Override
            public int bedtime() {
                return 0;
            }
        };
    }

}
