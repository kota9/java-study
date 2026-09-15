package com.example.study;

import com.example.study.day9.User;

public class Main {

    public static void main(String[] args) {

        // Day1
//        User user = new User(1L, "Kota");
//
//        Product product = new Product(
//                100L,
//                "Keyboard",
//                100000
//        );
//
//        System.out.println(user.getName());
//        System.out.println(product.getName());
//        System.out.println(product.getPrice());

        // Day2
//        Animal animal1 = new Dog();
//        Animal animal2 = new Cat();
//        animal1.sound();
//        animal2.sound();

//        Payment payment = new KakaoPay();
//        Payment payment = new NaverPay();
//        payment.pay();

//        OrderService orderService = new OrderService(new KakaoPay());
//        OrderService orderService = new OrderService(new NaverPay());
//        orderService.order();

        // Day3
//        OrderStatus status = OrderStatus.PAID;
//        System.out.println("Order Status: " + status);
//        System.out.println(status.getDescription());

//        UserDto user = new UserDto(1L, "Kim");
//        System.out.println(user.id());
//        System.out.println(user.name());

        // Day4, 5
//        List<String> names = new ArrayList<>();
//
//        names.add("Kim");
//        names.add("Lee");
//        names.add("Park");
//        names.add("Kim");
//
//        System.out.println(names);
//        System.out.println(names.get(0));

//        Set<String> names = new HashSet<>();
//        Set<String> names2 = new HashSet<>();
//
//        names.add("John");
//        names.add("Jane");
//        names.add("Julie");
//        names.add("John");
//        names2.add("John");
//        names2.add("Jane");
//        names2.add("Julie");
//        names2.add("John");
//
//        System.out.println(names);
//
//        System.out.println(names.hashCode());
//        System.out.println(names2.hashCode());
//        System.out.println(names.equals(names2));

//        Map<String, Integer> users = new HashMap<>();
//
//        users.put("a", 1);
//        users.put("b", 2);
//        users.put("c", 3);
//        users.put("a", 4);
//
//        System.out.println(users.get("a"));

        // Day6
//        Product product = new Product("MacBook", 2000000);
//
//        Predicate<Product> expensive = p -> p.getPrice() >= 1000000;
//        System.out.println(expensive.test(product));
//
//        Function<Product, String> getProductName = p -> p.getName();
//        Function<Product, String> getName = Product::getName;
//        System.out.println(getProductName.apply(product));
//        System.out.println(getName.apply(product));
//
//        Consumer<Product> printProduct = p -> System.out.println(p.getName());
//        printProduct.accept(product);
//
//        Supplier<Product> createProduct = () -> new Product("iPhone", 1500000);
//        Product newProduct = createProduct.get();
//        System.out.println(newProduct.getName());

        // Day7
//        List<Product> products = List.of(
//                new Product(1L, "키보드", "컴퓨터", 50000, true),
//                new Product(2L, "마우스", "컴퓨터", 30000, true),
//                new Product(3L, "모니터", "컴퓨터", 200000, true),
//                new Product(4L, "셔츠", "의류", 40000, true),
//                new Product(5L, "바지", "의류", 60000, false),
//                new Product(6L, "운동화", "의류", 100000, true),
//                new Product(7L, "책상", "가구", 150000, true),
//                new Product(8L, "의자", "가구", 80000, false)
//        );

//        List<Product> activeProducts = products.stream()
//                .filter(Product::isActive)
//                .toList();

//        List<String> productNames = products.stream()
//                .map(Product::getName)
//                .toList();
//        System.out.println(productNames);

//        List<Product> sortedProducts = products.stream()
//                .sorted(Comparator.comparing(Product::getPrice))
//                .toList();
//        System.out.println(sortedProducts.get(0).getName());

//        List<Product> sortedReverseProducts = products.stream()
//                .sorted(
//                        Comparator.comparing(Product::getPrice)
//                                .reversed()
//                )
//                .toList();
//        System.out.println(sortedReverseProducts.get(0).getName());

//        Map<String, List<Product>> productsByCategory = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory));
//        System.out.println(productsByCategory);

//        Map<String, Long> countByCategory = products.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                Product::getCategory,
//                                Collectors.counting()
//                        )
//                );
//        System.out.println(countByCategory);

//        Product maxPriceProduct = products.stream()
//                .max(Comparator.comparing(Product::getPrice))
//                .orElseThrow(null);
//        System.out.println(maxPriceProduct.getName());

//        Map<Long, Product> productMap = products.stream()
//                .collect(Collectors.toMap(
//                        Product::getId,
//                        Function.identity()
//                ));
//        System.out.println(productMap);

//        List<Product> result = products.stream()
//                .filter(Product::isActive)
//                .filter(product -> product.getPrice() >= 50000)
//                .sorted(
//                        Comparator.comparing(Product::getPrice)
//                                .reversed()
//                )
//                .limit(5)
//                .toList();
//
//        System.out.println(result.stream().map(Product::getName).collect(Collectors.joining(", ")));

//        List<String> result = products.stream()
//                .filter(Product::isActive)
//                .filter(product -> product.getPrice() >= 30000)
//                .sorted(Comparator.comparing(Product::getPrice)
//                        .reversed())
//                .limit(3)
//                .map(Product::getName)
//                .toList();
//        System.out.println(result);

        // Day8
//        throw new ProductNotFoundException("PRODUCT_NOT_FOUND", "상품을 찾을 수 없습니다.");
//        throw new InsufficientStockException("INSUFFICIENT_STOCK", "재고가 부족합니다.");

        // Day9
        User user1 = new User("Kota");
        User user2 = user1;

        user1.printName();
//        System.out.println(user1 == user2);
        user1 = null;


    }
}
