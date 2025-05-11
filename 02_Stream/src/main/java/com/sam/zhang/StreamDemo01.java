package com.sam.zhang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamDemo01 {

    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        //打印所有年龄小于18 的作者名称，并且去重
        authors.stream()
                .distinct()
                .filter(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getAge() < 18;
                    }
                })
                .forEach(new Consumer<Author>() {
                    @Override
                    public void accept(Author author) {
                        System.out.println(author.getName());
                    }
                });

        authors.stream()
                .distinct()
                .filter(author -> author.getAge() < 18)
                .forEach(author -> System.out.println(author.getName()));
    }

    private static List<Author> getAuthors() {
        Author author = new Author(1L,"张三",33,"一个人的春天", null);
        Author author1 = new Author(2L, "李四", 16, "一个人的秋天", null);
        Author author2 = new Author(3L, "王五", 14, "一个人的冬天", null);
        Author author3 = new Author(3L, "王五", 14, "一个人的冬天", null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L, "刀的两侧是光明与黑暗", "哲学, 爱情", 88, "用一把划分了爱恨"));
        books1.add(new Book(2L, "一个人不能死在同一把刀下", "个人成长, 爱情", 99, "失败与成长"));

        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "用思维领略世界尽头"));
        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "用思维领略世界尽头"));
        books2.add(new Book(4L, "吹或不吹", "爱情，个人传记", 56, "一个哲学家的恋爱观"));

        books3.add(new Book(5L, "你的剑", "爱情", 56, "武者与伴侣"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "灵魂与肉体的碰撞"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "灵魂与肉体的碰撞"));

        author.setBooks(books1);
        author1.setBooks(books2);
        author2.setBooks(books3);
        author3.setBooks(books3);

        return new ArrayList<>(Arrays.asList(author, author1, author2, author3));
    }
}
