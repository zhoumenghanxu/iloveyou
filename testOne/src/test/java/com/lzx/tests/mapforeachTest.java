package com.lzx.tests;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.lzx.tests.models.Person;
import com.lzx.tests.interfaces.bigFunction;
import com.lzx.tests.models.testModel;
import org.apache.commons.lang3.*;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class mapforeachTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void foreach() {
        Map<String, StringBuffer> testMap = new HashMap<>();
        testMap.put("1", new StringBuffer("xu"));
        testMap.put("2", new StringBuffer("ze"));
        mapforeach.Foreach(testMap);
    }

    @Test
    public void InstantTest() {
        //获得当前时间
        /*Instant now = Instant.now();
        System.out.println(now);*/
        //将java.util.Date转化成java.time.Instan
       /* Instant now1 = Instant.ofEpochMilli(new Date().getTime());
        System.out.println(now1);*/
        /*Instant now3 = Instant.parse("1995-10-23T10:12:35Z");
        System.out.println(now3);*/
        //你可以使用这些方法访问秒和纳秒。
        //getEpochSecond
        //getNano
       /* long epochSecond = Instant.now().getEpochSecond();
        int nano = Instant.now().getNano();
        System.out.println(epochSecond);
        System.out.println(nano);*/
        /*File file = new File(".");
        String[] list = file.list();
        for (String xx : list) {
            System.out.println(xx);
        }*/

        /*DefaultMethodClass a=new DefaultMethodClass();
        a.methods();
        Function*/
       /* Function<String, Integer> toInteger = Integer::valueOf;

        Function<String, String> backToString = toInteger.andThen(String::valueOf);*/
/*
        List<Person> personList = Arrays.asList(Person.of("ss", 1, Instant.now()),
                                                    Person.of("ss1", 2, Instant.now()),
                                                    Person.of("ss2", 3, Instant.now()));*/
        //Person ss = Person.of("ss", 1);

        /*List<PersonVo> personVoList = new ArrayList<>();
        Person person = new Person();
        this.forEach(personList, personVoList,
                    (List<PersonVo> pvol, Person p)->{
                        PersonVo personVo = new PersonVo();
                        personVo.setName(p.getName());
                        personVo.setAge(p.getAge());
                        personVo.setBirthday(p.getBirthday());
                        pvol.add(personVo);
                    });
        personVoList.stream().forEach(System.out::println);*/
        /*personList.stream().map(person -> person.getAge())
                                    .collect(Collectors.toList())
                                    .stream().forEach(System.out::println);
        System.out.println("================================");
        personList.stream().map(Object::toString)
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);*/
        /*System.out.println("================================");
        personList.stream().map(person::getAge)
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);*/
        //System.out.println("================================");
        //bigFunction<String, Integer, Instant, Person> s = (a, b, c) -> new Person(a, b, c);
        //Person sss = this.getPerson("sss", 1, Instant.now(), (a, b, c) -> new Person(a, b, c));
        //System.out.println(sss.toString());
        /*System.out.println("================================");
        Person sss1 = this.getPerson("sss", 1, Instant.now(), Person::new);
        Person sss2 = this.getPerson( Person::new);
        System.out.println(sss1.toString());
        System.out.println(sss2.toString());*/
        //System.out.println("================================");
        //Supplier<String> con=() -> sss.toString();
        //this.forEach(() -> sss.toString());
        //System.out.println("================================");
        ///this.forEach(sss::toString);
       /* Boolean x = true;
        Boolean y = false;
        Boolean z = true;
        System.out.println(BooleanUtils.compare(x, x));*/
        //String value = testModel.BB.getValue();
        //testModel ss=testModel.BB;
        //System.out.println(ss.name()+"\n"+ss.ordinal());
        //testModel[] values = testModel.values();
        //System.out.println("===================");
       /* Arrays.asList(values).stream().forEach(System.out::println);
        boolean b = ObjectUtils.allNotNull(values);
        System.out.println(b);*/
        /*String name="asdf";
        String[] split = name.split("");
        Arrays.asList( name.split("")).stream().forEach(System.out::println);*/
       /* List<String> tetsString = new ArrayList<>();
        tetsString.add("hellow");
        tetsString.add("world");
        List<String[]> collect = tetsString.stream().map(word -> word.split("")).distinct().collect(Collectors.toList());
        List<Stream<String>> collect1 = tetsString.stream().map(word -> word.split("")).map(Arrays::stream).collect(Collectors.toList());
        List<String> collect2 = tetsString.stream().map(word -> word.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        List<Integer> numbers1=Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(4, 5);
        List<Stream<int[]>> collect3 = numbers1.stream().map(integer -> numbers2.stream()
                                        .map(integer1 -> new int[]{integer, integer1})).collect(Collectors.toList());
        List<int[]> collect4 = numbers1.stream().flatMap(integer -> numbers2.stream().map(integer1 -> new int[]{integer, integer1})).collect(Collectors.toList());
        */
        /*int i = RandomUtils.nextInt(0, 10);
        System.out.println(i);*/
       /* String[] xx=null;
        String[] yy={};
        String[] zz={"1"};
        System.out.println(ArrayUtils.isEmpty(xx));
        System.out.println(ArrayUtils.isNotEmpty(xx));
        System.out.println("===================================");
        System.out.println(ArrayUtils.isEmpty(yy));
        System.out.println(ArrayUtils.isNotEmpty(yy));
        System.out.println("===================================");
        System.out.println(ArrayUtils.isEmpty(zz));
        System.out.println(ArrayUtils.isNotEmpty(zz));
        System.out.println("===================================");*/
        /*Person sss = new Person("sss", 1, Instant.now(), Arrays.asList("s", "1"));
        Person clone = ObjectUtils.clone(sss);
        //Person clone = (Person)sss.clone();
        System.out.println(sss);
        System.out.println(clone);
        System.out.println("======================");
        sss.setAge(2);
        System.out.println(sss);
        System.out.println(clone);
        System.out.println("======================");
        clone.setAge(3);
        System.out.println(sss);
        System.out.println(clone);
        System.out.println("======================");*/
        /*Person sss = new Person("sss", 1, Instant.now(), ImmutableList.of("s", "1"));
        Person sss1 = new Person("xxx", 2, Instant.now(), ImmutableList.of("s", "1"));*/
       /* System.out.println(sss1.equals(sss));
        ImmutableList<Person> persons = ImmutableList.of(sss, sss1);*/
        /*ImmutableList<Person> personImmutableList = ImmutableList.of(new Person("s1", 1, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s2", 2, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s3", 2, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s4", 1, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s5", 3, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s6", 3, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s7", 4, Instant.now(), ImmutableList.of("s", "1")));
        HashMultimap<Integer, Person> personMultimap = HashMultimap.create();
        personImmutableList.stream().forEach((person) -> personMultimap.put(person.getAge(), person));*/
       /* List<String> strings = Arrays.asList("1\t2\t3",
                "q\tw\te",
                "a\ts\td");
        List<String[]> collect = strings.stream().map(s -> s.split("\t")).collect(Collectors.toList());
        List<Stream<String>> collect2 = strings.stream().map(s -> s.split("\t")).map(Arrays::stream).collect(Collectors.toList());
        List<String> collects = strings.stream().map(s -> s.split("\t")).flatMap(Arrays::stream).collect(Collectors.toList());
        List<String> collect1 = strings.stream().map(s -> s.substring(0,s.indexOf("\t"))).collect(Collectors.toList());

        collect1.stream().forEach(System.out::println);
        System.out.println("+=================");
        collects.stream().forEach(System.out::println);
        System.out.println("");*/
       //斐波那契数列
        /*Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .map(t -> t[0])
                .limit(10).forEach(System.out::println);
        ObjIntConsumer*/
        /*Person person1=null;
        System.out.println(Objects.nonNull(person1));
        System.out.println(Objects.isNull(person1));*/
       /* ArrayList<Integer> Integes = Lists.newArrayList();
        System.out.println(Integes);
        System.out.println("============");
        this.dddd(Integes);
        System.out.println(Integes);*/
        /*ImmutableList<Person> personImmutableList = ImmutableList.of(new Person("s1", 1, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s2", 2, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s3", 2, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s4", 1, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s5", 3, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s6", 3, Instant.now(), ImmutableList.of("s", "1")),
                new Person("s7", 4, Instant.now(), ImmutableList.of("s", "1")));
        Stream<Person> stream = personImmutableList.stream();*/
        /*ArrayList<Person> collect = stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);*/
        //IntSummaryStatistics collect = stream.collect(Collectors.summarizingInt(Person::getAge));
        /*Optional<Person> collect = stream.collect(Collectors.maxBy(Comparator.comparingInt(Person::getAge)));
        Person person = collect.get();
        System.out.println(person);*/
        /*Integer collect = stream.collect(Collectors.collectingAndThen(Collectors.toList(), List::size));
        System.out.println(collect);*/
      Instant now = Instant.now();
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        ZonedDateTime now4 = ZonedDateTime.now();
         System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);
        System.out.println(now4);
       /* LocalDate birthday = LocalDate.of(1996, 12, 20);
        LocalDate now = LocalDate.now();
        MonthDay birth = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
        MonthDay from = MonthDay.from(now);
        if (Objects.equals(birth, from)){
            System.out.println("生日");
        }else {
            System.out.println("sss");
        }*/
        /*Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        Clock clock1 = Clock.systemDefaultZone();
        System.out.println(clock1);*/
        /*YearMonth now = YearMonth.now();
        System.out.println(now);
        System.out.println(now.lengthOfMonth());*/
       /* Instant now = Instant.now();
        System.out.println(now);*/
       //String date = "2018/09/01";
        /*LocalDate parse = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse);*/
        try {
            DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("yyyy/MM/dd");
           /* LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
            System.out.println(parse);*/
            String format = now3.format(dateTimeFormatter);
            System.out.println(format);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*public  <T, U> void forEach(List<T> tList, List<U> ulist, BiConsumer<List<U>, T> biConsumer){
        Objects.requireNonNull(biConsumer);
        for (T t :tList){
            biConsumer.accept(ulist, t);
        }
    }
    public Person getPerson(String s, Integer i, Instant is, bigFunction<String, Integer, Instant, Person> bg){
        return bg.apply(s, i, is);
    }
    public Person getPerson(Supplier<Person> s){
        return s.get();
    }
    public void forEach(Supplier<String> con){
        String s = con.get();
        System.out.println(s);
    }*/
    public void dddd(List<Integer> xx){
        ArrayList<Integer> Integes = Lists.newArrayList();
        Integes.add(1);
        xx=Integes;
    }
}