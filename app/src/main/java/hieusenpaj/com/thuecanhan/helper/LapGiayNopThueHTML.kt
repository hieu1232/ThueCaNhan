package hieusenpaj.com.thuecanhan.helper

import hieusenpaj.com.thuecanhan.`object`.LapGiayNopThue

inline fun LapGiayNopThueHTML(gnt:LapGiayNopThue):String{
    return "<html>\n" +
            "<head><meta http-equiv=Content-Type content=\"text/html; charset=UTF-8\">\n" +
            "<style type=\"text/css\">\n" +
            "<!--\n" +
            "span.cls_002{font-family:Times,serif;font-size:16.0px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "div.cls_002{font-family:Times,serif;font-size:16.0px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "span.cls_003{font-family:Times,serif;font-size:14.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "div.cls_003{font-family:Times,serif;font-size:14.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "span.cls_004{font-family:Times,serif;font-size:12.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "div.cls_004{font-family:Times,serif;font-size:12.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "span.cls_005{font-family:Times,serif;font-size:24.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "div.cls_005{font-family:Times,serif;font-size:24.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "-->\n" +
            "</style>\n" +
            "<script type=\"text/javascript\" src=\"5827d944-7a3d-11ea-8b25-0cc47a792c0a_id_5827d944-7a3d-11ea-8b25-0cc47a792c0a_files/wz_jsgraphics.js\"></script>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div style=\"position:absolute;top:0px;width:595px;height:841px;border-style:outset;overflow:hidden\">\n" +
            "<div style=\"position:absolute;left:0px;top:0px\">\n" +
            "<img src=\"5827d944-7a3d-11ea-8b25-0cc47a792c0a_id_5827d944-7a3d-11ea-8b25-0cc47a792c0a_files/background1.jpg\" width=595 height=841></div>\n" +
            "<div style=\"position:absolute;left:245.33px;top:69.66px\" class=\"cls_002\"><span class=\"cls_002\">GIẤY NỘP TIỀN</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:142.14px\" class=\"cls_003\"><span class=\"cls_003\">1. THÔNG TIN NGƯỜI NỘP TIỀN</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:188.82px\" class=\"cls_004\"><span class=\"cls_004\">Ngày:${gnt.time}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:216.42px\" class=\"cls_004\"><span class=\"cls_004\">Mã số thuế:${gnt.mst}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:256.05px\" class=\"cls_004\"><span class=\"cls_004\">Tên người nộp thuế:${gnt.name}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:295.65px\" class=\"cls_004\"><span class=\"cls_004\">Địa chỉ:${gnt.address}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:365.49px\" class=\"cls_003\"><span class=\"cls_003\">2. THÔNG TIN NGÂN HÀNG</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:412.17px\" class=\"cls_004\"><span class=\"cls_004\">Đề nghị ngân hàng:${gnt.p1}</span></div>\n" +
            "<div style=\"position:absolute;left:360.07px;top:412.17px\" class=\"cls_004\"><span class=\"cls_004\">Trích TK số:${gnt.p2}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:483.71px\" class=\"cls_003\"><span class=\"cls_003\">3. THÔNG TIN CƠ QUAN QUẢN LÍ THU</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:530.51px\" class=\"cls_004\"><span class=\"cls_004\">Tỉnh/Thành phố:${gnt.p3}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:558.11px\" class=\"cls_004\"><span class=\"cls_004\">Cơ quan quản lí thu:${gnt.p4}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:620.18px\" class=\"cls_003\"><span class=\"cls_003\">4. THÔNG TIN KHO BẠC</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:666.86px\" class=\"cls_004\"><span class=\"cls_004\">Chuyển cho KBNH:${gnt.p5}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:694.46px\" class=\"cls_004\"><span class=\"cls_004\">Mở tại NHTM ủy nhiệm thu:${gnt.p6}</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:721.70px\" class=\"cls_002\"><span class=\"cls_002\">○</span><span class=\"cls_004\">Nộp vào NSNN (TK711)</span></div>\n" +
            "<div style=\"position:absolute;left:361.51px;top:721.70px\" class=\"cls_002\"><span class=\"cls_002\">○</span><span class=\"cls_004\">Thu hồi hoàn (TK8993)</span></div>\n" +
            "</div>\n" +
            "<div style=\"position:absolute;top:851px;width:595px;height:841px;border-style:outset;overflow:hidden\">\n" +
            "<div style=\"position:absolute;left:0px;top:0px\">\n" +
            "<img src=\"5827d944-7a3d-11ea-8b25-0cc47a792c0a_id_5827d944-7a3d-11ea-8b25-0cc47a792c0a_files/background2.jpg\" width=595 height=841></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:111.78px\" class=\"cls_003\"><span class=\"cls_003\">5. NỘI DUNG CÁC KHOẢN NỘP NSNN</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:158.46px\" class=\"cls_004\"><span class=\"cls_004\">Kì thuế (Quý):${gnt.p7}</span></div>\n" +
            "<div style=\"position:absolute;left:79.34px;top:186.54px\" class=\"cls_004\"><span class=\"cls_004\">STT</span></div>\n" +
            "<div style=\"position:absolute;left:121.22px;top:186.54px\" class=\"cls_004\"><span class=\"cls_004\">Số tờ khai/Số</span></div>\n" +
            "<div style=\"position:absolute;left:216.17px;top:186.54px\" class=\"cls_004\"><span class=\"cls_004\">Ký thuế/Ngày</span></div>\n" +
            "<div style=\"position:absolute;left:316.03px;top:186.54px\" class=\"cls_004\"><span class=\"cls_004\">Nội dung các khoản nộp</span></div>\n" +
            "<div style=\"position:absolute;left:458.38px;top:186.54px\" class=\"cls_004\"><span class=\"cls_004\">Ghi chú</span></div>\n" +
            "<div style=\"position:absolute;left:524.38px;top:186.54px\" class=\"cls_004\"><span class=\"cls_004\">Số tiền</span></div>\n" +
            "<div style=\"position:absolute;left:128.30px;top:200.34px\" class=\"cls_004\"><span class=\"cls_004\">quyết định</span></div>\n" +
            "<div style=\"position:absolute;left:224.45px;top:200.34px\" class=\"cls_004\"><span class=\"cls_004\">quyết định</span></div>\n" +
            "<div style=\"position:absolute;left:528.22px;top:200.34px\" class=\"cls_004\"><span class=\"cls_004\">VND</span></div>\n" +
            "<div style=\"position:absolute;left:72.02px;top:297.93px\" class=\"cls_004\"><span class=\"cls_004\">Số tiền bằng chữ:${gnt.p23}</span></div>\n" +
            "<div style=\"position:absolute;left:396.07px;top:297.93px\" class=\"cls_004\"><span class=\"cls_004\">Tổng tiền:${gnt.p24}</span></div>\n" +
            "    \n" +
            "    <div style=\"position:absolute;left:112.22px;top:225.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p8}</span></div>\n" +
            "    <div style=\"position:absolute;left:112.22px;top:250.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p13}</span></div>\n" +
            "    <div style=\"position:absolute;left:112.22px;top:275.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p18}</span></div>\n" +
            "    <div style=\"position:absolute;left:216.17px;top:225.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p9}</span></div>\n" +
            "    <div style=\"position:absolute;left:216.17px;top:250.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p14}</span></div>\n" +
            "    <div style=\"position:absolute;left:216.17px;top:275.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p19}</span></div>\n" +
            "    <div style=\"position:absolute;left:316.17px;top:225.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p10}</span></div>\n" +
            "    <div style=\"position:absolute;left:316.17px;top:250.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p15}</span></div>\n" +
            "    <div style=\"position:absolute;left:316.17px;top:275.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p20}</span></div>\n" +
            "    <div style=\"position:absolute;left:458.38px;top:225.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p11}</span></div>\n" +
            "    <div style=\"position:absolute;left:458.38px;top:250.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p16}</span></div>\n" +
            "    <div style=\"position:absolute;left:458.38px;top:275.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p21}</span></div>\n" +
            "    <div style=\"position:absolute;left:524.38px;top:225.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p12}</span></div>\n" +
            "    <div style=\"position:absolute;left:524.38px;top:250.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p17}</span></div>\n" +
            "    <div style=\"position:absolute;left:524.38px;top:275.34px\" class=\"cls_004\"><span class=\"cls_004\">${gnt.p22}</span></div>\n" +
            "\n" +
            "    <div style=\"position:absolute;left:72.02px;top:311.01px\" class=\"cls_005\"><span class=\"cls_005\">□</span><span class=\"cls_004\">Lưu thông tin giấy nộp tiền (Hỗ trợ hiển thị nhanh cho lần lập GNT tiếp theo)</span></div>\n" +
            "</div>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n"
}