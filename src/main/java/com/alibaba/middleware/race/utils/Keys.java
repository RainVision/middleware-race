package com.alibaba.middleware.race.utils;

import java.util.Arrays;

public class Keys {

    public static final int SIZE = 194;

    public static final byte TABLE_GOODS = 0;
    public static final byte TABLE_BUYER = 1;
    public static final byte TABLE_ORDER = 2;

    public static final int BUYER_ID_INDEX = 155;
    public static final int GOODS_ID_INDEX = 129;
    public static final int ORDER_ID_INDEX = 130;
    public static final int CREATE_TIME_INDEX = 191;

    public static final byte TYPE_BOOLEAN = 0;
    public static final byte TYPE_LONG = 1;
    public static final byte TYPE_DOUBLE = 2;
    public static final byte TYPE_STRING = 3;
    public static final byte TYPE_UNION = 4;
    public static final byte TYPE_LONG_STRING = 5;

    public static final byte[] KEYS_TYPE = {5, 3, 2, 2, 0, 0, 1, 1, 0, 1, 2, 1, 2, 3, 4, 2, 1, 0, 1, 1, 3, 4, 3, 1, 2, 1, 4, 1, 1, 1, 4, 4, 2, 0, 1, 4, 3, 1, 0, 1, 1, 1, 1, 4, 1, 1, 2, 1, 3, 2, 2, 2, 1, 2, 2, 3, 2, 1, 1, 1, 1, 4, 1, 2, 1, 1, 2, 1, 3, 0, 0, 1, 1, 0, 1, 3, 4, 2, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 4, 1, 4, 4, 1, 4, 1, 0, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 0, 1, 3, 1, 1, 1, 1, 1, 2, 2, 4, 0, 2, 1, 2, 1, 4, 2, 2, 2, 1, 1, 4, 3, 1, 3, 2, 1, 2, 3, 3, 1, 1, 1, 0, 4, 1, 1, 2, 1, 0, 1, 2, 1, 3, 2, 3, 0, 2, 3, 4, 3, 1, 2, 2, 1, 4, 3, 2, 4, 1, 4, 1, 1, 1, 1, 1, 1, 0, 2, 4, 2, 1, 1, 1, 2, 1, 0, 3, 2, 1, 1, 1, 1, 3, 1, 3, 3};
    public static final byte[] KEYS_TABLE = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 0, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 0, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0};
    public static final String[] KEYS_STRING = {"description", "a_b_10914", "a_b_11688", "a_b_11743", "a_b_11763", "a_b_12047", "a_b_13198", "a_b_13411", "a_b_14328", "a_b_14371", "a_b_14733", "a_b_14761", "a_b_15312", "a_b_16838", "a_b_17248", "a_b_20093", "a_b_21105", "a_b_21659", "a_b_22473", "a_b_22568", "a_b_22632", "a_b_22903", "a_b_25733", "a_b_26268", "a_b_26481", "a_b_26491", "a_b_28236", "a_b_28555", "a_b_29808", "a_b_32480", "a_b_32635", "a_g_11667", "a_g_12050", "a_g_12394", "a_g_12734", "a_g_12771", "a_g_12796", "a_g_12983", "a_g_13352", "a_g_13561", "a_g_13701", "a_g_13763", "a_g_13929", "a_g_14476", "a_g_14737", "a_g_15211", "a_g_16102", "a_g_16164", "a_g_16215", "a_g_16216", "a_g_16232", "a_g_17235", "a_g_17313", "a_g_17438", "a_g_17777", "a_g_18301", "a_g_18714", "a_g_18794", "a_g_19485", "a_g_19489", "a_g_19843", "a_g_19998", "a_g_20200", "a_g_21161", "a_g_21525", "a_g_22398", "a_g_22635", "a_g_23086", "a_g_23413", "a_g_23466", "a_g_23564", "a_g_24338", "a_g_24613", "a_g_24644", "a_g_25202", "a_g_25258", "a_g_25482", "a_g_26420", "a_g_26491", "a_g_26716", "a_g_26854", "a_g_27569", "a_g_27616", "a_g_28009", "a_g_28103", "a_g_28112", "a_g_28841", "a_g_28942", "a_g_29704", "a_g_30029", "a_g_30056", "a_g_31698", "a_g_31798", "a_g_31961", "a_g_32350", "a_b_1132", "a_b_1323", "a_b_1395", "a_b_2726", "a_b_4823", "a_b_5174", "a_b_5362", "a_b_5933", "a_b_6043", "a_b_6306", "a_b_9485", "a_b_9794", "amount", "a_g_1562", "a_g_2156", "a_g_2285", "a_g_3357", "a_g_4399", "a_g_4467", "a_g_4643", "a_g_4663", "a_g_5015", "a_g_5467", "a_g_5875", "a_g_5896", "a_g_7039", "a_g_7610", "a_g_9070", "a_g_9859", "a_g_9960", "a_b_725", "a_b_963", "a_o_639", "a_o_906", "goodid", "orderid", "address", "a_o_1400", "a_o_1611", "a_o_1765", "a_o_2427", "a_o_2830", "a_o_3631", "a_o_4266", "a_o_4771", "a_o_5335", "a_o_6162", "a_o_6281", "a_o_6632", "a_o_6639", "a_o_6815", "a_o_7014", "a_o_7877", "a_o_8141", "a_o_8667", "remark", "offprice", "buyername", "done", "price", "buyerid", "contactphone", "a_o_10930", "a_o_11046", "a_o_13185", "a_o_14051", "a_o_14885", "a_o_15476", "a_o_16232", "a_o_16727", "a_o_16844", "a_o_16953", "a_o_17254", "a_o_18460", "a_o_19749", "a_o_22112", "a_o_22896", "a_o_23145", "a_o_23354", "a_o_23887", "a_o_24210", "a_o_24368", "a_o_25766", "a_o_28034", "a_o_28470", "a_o_28646", "a_o_29340", "a_o_29364", "a_o_29449", "a_o_29524", "a_o_29643", "a_o_30620", "a_o_31258", "a_o_31720", "a_o_31778", "a_o_32380", "createtime", "good_name", "salerid"};
    private static final int[] HASHES_SORTED = {-1724546052, -1618610782, -1618583653, -1618582821, -1618582759, -1618559753, -1618528845, -1618526217, -1618497349, -1618497201, -1618493479, -1618493388, -1618467595, -1618432931, -1618408875, -1617695663, -1617665188, -1617660224, -1617632299, -1617631364, -1617630502, -1617627711, -1617540167, -1617515083, -1617513106, -1617513075, -1617455596, -1617452652, -1617420130, -1616708750, -1616706978, -1476032607, -1476008620, -1476005609, -1476001951, -1476001830, -1476001763, -1475999875, -1475975944, -1475973992, -1475972256, -1475972068, -1475970264, -1475945126, -1475942366, -1475917448, -1475888648, -1475888460, -1475887653, -1475887652, -1475887594, -1475857800, -1475856903, -1475855875, -1475852869, -1475827145, -1475823267, -1475823019, -1475796141, -1475796137, -1475792423, -1475791302, -1475142914, -1475113897, -1475110173, -1475082084, -1475079390, -1475055209, -1475051585, -1475051427, -1475050468, -1475022688, -1475019872, -1475019778, -1474993957, -1474993796, -1474991787, -1474962184, -1474961966, -1474959326, -1474958243, -1474931299, -1474930496, -1474906499, -1474905544, -1474905514, -1474898695, -1474897733, -1474869986, -1474221244, -1474221154, -1474185471, -1474184510, -1474182688, -1474158695, -1437685798, -1437683906, -1437683687, -1437650268, -1437589728, -1437566508, -1437564619, -1437558945, -1437537772, -1437535010, -1437444429, -1437441516, -1413853096, -1294536106, -1294510186, -1294509133, -1294478472, -1294448555, -1294447689, -1294445833, -1294445771, -1294421899, -1294417898, -1294414025, -1294413962, -1294362251, -1294356556, -1294302554, -1294294919, -1294293936, -1293297153, -1293295109, -1281292306, -1281289519, -1240247656, -1207109399, -1147692044, -1065504047, -1065502093, -1065500973, -1065474187, -1065470319, -1065442449, -1065416404, -1065411573, -1065385746, -1065357787, -1065356765, -1065353075, -1065353068, -1065351212, -1065329110, -1065321233, -1065298268, -1065293395, -934624384, -758378182, -272536898, 3089282, 106934601, 245526030, 1293266254, 1329002537, 1329023716, 1329084382, 1329113115, 1329120900, 1329146817, 1329174558, 1329179337, 1329180357, 1329181348, 1329204413, 1329236153, 1329268774, 1329977892, 1329984871, 1330007779, 1330009731, 1330014632, 1330038433, 1330039557, 1330073190, 1330155741, 1330159705, 1330161540, 1330188442, 1330188508, 1330189412, 1330190306, 1330191328, 1330846665, 1330872713, 1330877417, 1330877580, 1330903550, 1370166729, 1376886989, 1863597926};

    public static int indexOfString(String key){
        return Arrays.binarySearch(HASHES_SORTED, key.hashCode());
    }

    public static int indexOfBytes(byte[] bytes, int start, int to){
        int h = 0;
        for (int i = start; i < to; i++) {
                h = 31 * h + bytes[i];
        }
        return Arrays.binarySearch(HASHES_SORTED, h);
    }
}
