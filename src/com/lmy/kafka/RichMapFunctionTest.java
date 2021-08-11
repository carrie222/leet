package com.lmy.kafka;

//public class RichMapFunctionTest {
//    public static void main(String[] args) {
//        DataSet<String> text = data.map(new RichMapFunction<String, String>() {
//            //step1：定义计数器
//            LongCounter counter = new LongCounter();
//            @Override
//            public void open(Configuration parameters) throws Exception {
//                //step2：注册计数器
//                getRuntimeContext().addAccumulator("ele-counts-java", counter);
//            }
//
//            @Override
//            public String map(String value) throws Exception {
//                counter.add(1);
//                return value;
//            }
//        }).setParallelism(2);
//    }
//}
