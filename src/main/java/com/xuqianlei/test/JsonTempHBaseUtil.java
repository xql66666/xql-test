package com.xuqianlei.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * JsonTempHBaseUtil class
 *
 * @author qianlei.xu
 * @date 2020/8/4
 */
public class JsonTempHBaseUtil {
    public static void main(String[] args) {
        File file = new File("src/main/resources/baidu.json");
        FileWriter fileWriter = null;
        BufferedReader reader = null;
        //String laststr = "";
        String rowkey;

        try {
            reader = new BufferedReader(new FileReader(file));
            fileWriter = new FileWriter("src/main/resources/HbaseCompany.txt");
            String tempString = null;
            int line = 1;
            //一次读取一行 直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                //显示行号
                System.out.println("第几行:" + line);
                line++;
                System.out.println(tempString);
                System.out.println("======================");
                JSONObject company = JSONObject.parseObject(tempString);

                rowkey = (String) company.get("_id");

                String name = (String) company.get("name");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:mc','" + name + "'" + "\n");

                String dh = (String) company.get("电话：");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:dh','" + dh + "'" + "\n");

                String yx = (String) company.get("邮箱：");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:yx','" + yx + "'" + "\n");

                String gw = (String) company.get("官网：");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:gw','" + gw + "'" + "\n");

                String dz = (String) company.get("地址：");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:dz','" + dz + "'" + "\n");

                String jj = (String) company.get("简介：");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:jj','" + jj + "'" + "\n");

                String zczb = (String) company.get("注册资本");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:zczb','" + zczb + "'" + "\n");

                String sjzb = (String) company.get("实缴资本");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:sjzb','" + sjzb + "'" + "\n");

                String fddbr = (String) company.get("法定代表人");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:fddbr','" + fddbr + "'" + "\n");

                String jyzt = (String) company.get("经营状态");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:jyzt','" + jyzt + "'" + "\n");

                String cym = (String) company.get("曾用名");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:cym','" + cym + "'" + "\n");

                String sshy = (String) company.get("所属行业");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:sshy','" + sshy + "'" + "\n");

                String tyshxydm = (String) company.get("统一社会信用代码");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:tyshxydm','" + tyshxydm + "'" + "\n");

                String nsrsbh = (String) company.get("纳税人识别号");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:nsrsbh','" + nsrsbh + "'" + "\n");

                String gszch = (String) company.get("工商注册号");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:gszch','" + gszch + "'" + "\n");

                String zzjgdm = (String) company.get("组织机构代码");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:zzjgdm','" + zzjgdm + "'" + "\n");

                String djjg = (String) company.get("登记机关");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:djjg','" + djjg + "'" + "\n");

                String clrq = (String) company.get("成立日期");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:clrq','" + clrq + "'" + "\n");

                String qylx = (String) company.get("企业类型");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:qylx','" + qylx + "'" + "\n");

                String yjqx = (String) company.get("营业期限");
                //fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:clrq','" + clrq + "'" + "\n");

                String xzqh = (String) company.get("行政区划");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:xzqh','" + xzqh + "'" + "\n");

                String njrq = (String) company.get("审核/年检日期");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:njrq','" + njrq + "'" + "\n");

                String zcdz = (String) company.get("注册地址");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:zcdz','" + zcdz + "'" + "\n");

                String jyfw = (String) company.get("经营范围");
                fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','jbxx:jyfw','" + jyfw + "'" + "\n");

                JSONArray zyry = company.getJSONArray("persons");
                if (zyry != null) {
                    JSONArray newzyry = new JSONArray();
                    for (int i = 0; i < zyry.size(); i++) {
                        JSONObject zyryJSONObject = zyry.getJSONObject(i);
                        String person_name = (String) zyryJSONObject.get("person_name");
                        String person_job = (String) zyryJSONObject.get("person_job");
                        JSONObject jsonObject1 = new JSONObject();
                        jsonObject1.put("xm", person_name);
                        jsonObject1.put("zw", person_job);
                        newzyry.add(jsonObject1);
                    }
                    fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','glxx:zyry','" + newzyry.toJSONString() + "'" + "\n");
                }


                JSONArray dwtz = company.getJSONArray("invests");
                if (dwtz != null) {
                    JSONArray newdwtz = new JSONArray();
                    for (int i = 0; i < dwtz.size(); i++) {
                        JSONObject dwtzJSONObject = dwtz.getJSONObject(i);
                        String btzqymc = (String) dwtzJSONObject.get("invest_name");
                        String tzzb = (String) dwtzJSONObject.get("invest_ratio");
                        String rjje = (String) dwtzJSONObject.get("renjiao_amount");
                        String zt = (String) dwtzJSONObject.get("status");
                        JSONObject jsonObject2 = new JSONObject();
                        jsonObject2.put("btzqymc", btzqymc);
                        jsonObject2.put("tzzb", tzzb);
                        jsonObject2.put("rjje", rjje);
                        jsonObject2.put("zt", zt);
                        newdwtz.add(jsonObject2);
                    }
                    fileWriter.write("put 'gf_duigong:qyglxx','" + SecretUtil.md5(name) +"','glxx:dwtz','" + newdwtz.toJSONString() + "'" + "\n");
                }


                JSONArray gdxx = company.getJSONArray("holders");
                if (gdxx != null) {
                    JSONArray newgdxx = new JSONArray();
                    for (int i = 0; i < gdxx.size(); i++) {
                        JSONObject gdxxJSONObject = gdxx.getJSONObject(i);
                        String gd = (String) gdxxJSONObject.get("holder_name");
                        String cgbl = (String) gdxxJSONObject.get("holder_ratio");
                        String rjcze = (String) gdxxJSONObject.get("renjiao_amount");
                        String sjcze = (String) gdxxJSONObject.get("actual_amount");
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("gd", gd);
                        jsonObject.put("cgbl", cgbl);
                        jsonObject.put("rjcze", rjcze);
                        jsonObject.put("sjcze", sjcze);
                        newgdxx.add(jsonObject);
                    }
                    fileWriter.write("put 'gf_duigong:qygsxx','" + rowkey +"','glxx:gdxx','" + newgdxx.toJSONString() + "'" + "\n");
                }


                JSONArray kgqy = company.getJSONArray("controls");
                if (kgqy != null) {
                    JSONArray newkgqy = new JSONArray();
                    for (int i = 0; i < kgqy.size(); i++) {
                        JSONObject kgqyJSONObject = kgqy.getJSONObject(i);
                        String kgqymc = (String) kgqyJSONObject.get("被控股企业");
                        String tzzb = (String) kgqyJSONObject.get("投资占比");

                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("kgqymc", kgqymc);
                        jsonObject.put("tzzb", tzzb);
                        newkgqy.add(jsonObject);
                    }
                    fileWriter.write("put 'gf_duigong:qyglxx','" + SecretUtil.md5(name) +"','glxx:kgqy','" + newkgqy.toJSONString() + "'" + "\n");
                }

                //persons 主要人员
                //invests 对外投资
                //holders 股东信息
                //controls 控股企业

                //一致行动人   qyglxx:yzxdr
                //股东投资及任职  ->股东信息
                //高管投资及任职  ->主要人员
                //工商变更    qygsxx:bgjl
                //分支机构    qygsxx:fzjg
                fileWriter.write("\n\n\n");
                fileWriter.flush();



            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
