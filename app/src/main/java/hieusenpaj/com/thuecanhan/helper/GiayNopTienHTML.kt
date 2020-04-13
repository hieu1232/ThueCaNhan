package hieusenpaj.com.thuecanhan.helper

import hieusenpaj.com.thuecanhan.`object`.GiayNopTien

inline fun GiayNopTienHTML(gnt:GiayNopTien):String{
    return "<html>\n" +
            "<head><meta http-equiv=Content-Type content=\"text/html; charset=UTF-8\">\n" +
            "<style type=\"text/css\">\n" +
            "<!--\n" +
            "span.cls_002{font-family:Arial,serif;font-size:9.9px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: none}\n" +
            "div.cls_002{font-family:Arial,serif;font-size:9.9px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: none}\n" +
            "span.cls_003{font-family:Arial,serif;font-size:9.9px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "div.cls_003{font-family:Arial,serif;font-size:9.9px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "span.cls_005{font-family:Arial,serif;font-size:6.5px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "div.cls_005{font-family:Arial,serif;font-size:6.5px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}\n" +
            "span.cls_006{font-family:Arial,serif;font-size:9.9px;color:rgb(0,0,0);font-weight:normal;font-style:italic;text-decoration: none}\n" +
            "div.cls_006{font-family:Arial,serif;font-size:9.9px;color:rgb(0,0,0);font-weight:normal;font-style:italic;text-decoration: none}\n" +
            "span.cls_007{font-family:Arial,serif;font-size:6.5px;color:rgb(0,0,0);font-weight:normal;font-style:italic;text-decoration: none}\n" +
            "div.cls_007{font-family:Arial,serif;font-size:6.5px;color:rgb(0,0,0);font-weight:normal;font-style:italic;text-decoration: none}\n" +
            "-->\n" +
            "</style>\n" +
            "<script type=\"text/javascript\" src=\"f8ab87e6-7adb-11ea-8b25-0cc47a792c0a_id_f8ab87e6-7adb-11ea-8b25-0cc47a792c0a_files/wz_jsgraphics.js\"></script>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div style=\"position:absolute;top:0px;width:595px;height:842px;border-style:outset;overflow:hidden\">\n" +
            "<div style=\"position:absolute;left:0px;top:0px\">\n" +
            "<img src=\"f8ab87e6-7adb-11ea-8b25-0cc47a792c0a_id_f8ab87e6-7adb-11ea-8b25-0cc47a792c0a_files/background1.jpg\" width=595 height=842></div>\n" +
            "<div style=\"position:absolute;left:438.89px;top:35.28px\" class=\"cls_002\"><span class=\"cls_002\">Mẫu số: C1-02/NS</span></div>\n" +
            "<div style=\"position:absolute;left:218.16px;top:46.80px\" class=\"cls_003\"><span class=\"cls_003\">(Ban hành kèm theo Thông tư số 84/2016/TT-BTC của Bộ Tài chính)</span></div>\n" +
            "<div style=\"position:absolute;left:174.47px;top:89.52px\" class=\"cls_002\"><span class=\"cls_002\">GIẤY NỘP TIỀN VÀO NGÂN SÁCH NHÀ NƯỚC</span></div>\n" +
            "<div style=\"position:absolute;left:85.71px;top:95.52px\" class=\"cls_003\"><span class=\"cls_003\">Không ghi</span></div>\n" +
            "<div style=\"position:absolute;left:430.56px;top:95.52px\" class=\"cls_003\"><span class=\"cls_003\">Mã hiệu: ………</span></div>\n" +
            "<div style=\"position:absolute;left:80.98px;top:107.28px\" class=\"cls_003\"><span class=\"cls_003\">vào khu vực</span></div>\n" +
            "<div style=\"position:absolute;left:213.77px;top:107.28px\" class=\"cls_003\"><span class=\"cls_003\">Tiền mặt □</span></div>\n" +
            "<div style=\"position:absolute;left:280.94px;top:107.28px\" class=\"cls_003\"><span class=\"cls_003\">Chuyển Khoản □</span></div>\n" +
            "<div style=\"position:absolute;left:430.56px;top:113.28px\" class=\"cls_003\"><span class=\"cls_003\">Số: ……………</span></div>\n" +
            "<div style=\"position:absolute;left:100.17px;top:118.80px\" class=\"cls_003\"><span class=\"cls_003\">này</span></div>\n" +
            "<div style=\"position:absolute;left:165.16px;top:124.80px\" class=\"cls_003\"><span class=\"cls_003\">Loại tiền:</span></div>\n" +
            "<div style=\"position:absolute;left:233.53px;top:124.80px\" class=\"cls_003\"><span class=\"cls_003\">VND □       USD □</span></div>\n" +
            "<div style=\"position:absolute;left:340.63px;top:124.80px\" class=\"cls_003\"><span class=\"cls_003\">Khác:………...</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:140.88px\" class=\"cls_003\"><span class=\"cls_003\">Số tham chiếu</span><span class=\"cls_005\"><sup>(1)</sup></span><span class=\"cls_003\">:…………………</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:160.32px\" class=\"cls_003\"><span class=\"cls_003\">Người nộp thuế: ${gnt.p1}                . Mã số thuế:${gnt.p2}</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:178.08px\" class=\"cls_003\"><span class=\"cls_003\">Địa chỉ:</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:195.60px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p3}   Quận/Huyện: …………………… Tỉnh, TP:</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:213.36px\" class=\"cls_003\"><span class=\"cls_003\">Người nộp thay:</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:231.12px\" class=\"cls_003\"><span class=\"cls_003\">Địa chỉ:</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:248.88px\" class=\"cls_003\"><span class=\"cls_003\">…………………………………………… Quận/Huyện: …………………… Tỉnh, TP:</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:266.40px\" class=\"cls_003\"><span class=\"cls_003\">Đề nghị NH/ KBNN: ……………………….. trích TK số: ………………………. hoặc thu tiền mặt để nộp</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:278.16px\" class=\"cls_003\"><span class=\"cls_003\">NSNN theo:</span></div>\n" +
            "<div style=\"position:absolute;left:150.36px;top:278.16px\" class=\"cls_003\"><span class=\"cls_003\">TK thu NSNN □      TK tạm thu □</span></div>\n" +
            "<div style=\"position:absolute;left:316.38px;top:278.16px\" class=\"cls_003\"><span class=\"cls_003\">TK thu hồi hoàn thuế GTGT □</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:295.92px\" class=\"cls_003\"><span class=\"cls_003\">vào tài Khoản của KBNN: …………………………………………….  Tỉnh, TP:</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:313.68px\" class=\"cls_003\"><span class=\"cls_003\">Mở tại NH ủy nhiệm thu:</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:331.20px\" class=\"cls_003\"><span class=\"cls_003\">Nộp theo văn bản của cơ quan có thẩm quyền: Kiểm toán nhà nước □     Thanh tra tài chính □</span></div>\n" +
            "<div style=\"position:absolute;left:247.03px;top:348.96px\" class=\"cls_003\"><span class=\"cls_003\">Thanh tra Chính phủ □ Cơ quan có thẩm quyền khác □</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:366.72px\" class=\"cls_003\"><span class=\"cls_003\">Tên cơ quan quản lý thu:</span></div>\n" +
            "<div style=\"position:absolute;left:410.92px;top:386.16px\" class=\"cls_003\"><span class=\"cls_003\">Phần dành cho NH ủy</span></div>\n" +
            "<div style=\"position:absolute;left:156.33px;top:397.92px\" class=\"cls_003\"><span class=\"cls_003\">Phần dành cho người nộp thuế ghi</span></div>\n" +
            "<div style=\"position:absolute;left:397.08px;top:397.92px\" class=\"cls_003\"><span class=\"cls_003\">nhiệm thu/ NH phối hợp thu/</span></div>\n" +
            "<div style=\"position:absolute;left:437.89px;top:409.68px\" class=\"cls_003\"><span class=\"cls_003\">KBNN ghi</span></div>\n" +
            "<div style=\"position:absolute;left:101.25px;top:428.16px\" class=\"cls_003\"><span class=\"cls_003\">Số tờ khai/</span></div>\n" +
            "<div style=\"position:absolute;left:155.82px;top:428.16px\" class=\"cls_003\"><span class=\"cls_003\">Kỳ thuế/ Ngày</span></div>\n" +
            "<div style=\"position:absolute;left:228.94px;top:434.16px\" class=\"cls_003\"><span class=\"cls_003\">Nội dung các</span></div>\n" +
            "<div style=\"position:absolute;left:105.64px;top:439.92px\" class=\"cls_003\"><span class=\"cls_003\">Số quyết</span></div>\n" +
            "<div style=\"position:absolute;left:162.77px;top:439.92px\" class=\"cls_003\"><span class=\"cls_003\">quyết định/</span></div>\n" +
            "<div style=\"position:absolute;left:296.23px;top:439.92px\" class=\"cls_003\"><span class=\"cls_003\">Số nguyên</span></div>\n" +
            "<div style=\"position:absolute;left:354.97px;top:439.92px\" class=\"cls_003\"><span class=\"cls_003\">Số tiền</span></div>\n" +
            "<div style=\"position:absolute;left:75.26px;top:445.92px\" class=\"cls_003\"><span class=\"cls_003\">STT</span></div>\n" +
            "<div style=\"position:absolute;left:233.94px;top:445.92px\" class=\"cls_003\"><span class=\"cls_003\">Khoản nộp</span></div>\n" +
            "<div style=\"position:absolute;left:401.98px;top:445.92px\" class=\"cls_003\"><span class=\"cls_003\">Mã chương</span></div>\n" +
            "<div style=\"position:absolute;left:464.63px;top:445.92px\" class=\"cls_003\"><span class=\"cls_003\">Mã tiểu Mục</span></div>\n" +
            "<div style=\"position:absolute;left:105.64px;top:451.68px\" class=\"cls_003\"><span class=\"cls_003\">định / Số</span></div>\n" +
            "<div style=\"position:absolute;left:161.66px;top:451.68px\" class=\"cls_003\"><span class=\"cls_003\">Ngày thông</span></div>\n" +
            "<div style=\"position:absolute;left:315.97px;top:451.68px\" class=\"cls_003\"><span class=\"cls_003\">tệ</span></div>\n" +
            "<div style=\"position:absolute;left:359.98px;top:451.68px\" class=\"cls_003\"><span class=\"cls_003\">VND</span></div>\n" +
            "<div style=\"position:absolute;left:243.96px;top:457.44px\" class=\"cls_003\"><span class=\"cls_003\">NSNN</span></div>\n" +
            "<div style=\"position:absolute;left:103.13px;top:463.44px\" class=\"cls_003\"><span class=\"cls_003\">thông báo</span></div>\n" +
            "<div style=\"position:absolute;left:178.89px;top:463.44px\" class=\"cls_003\"><span class=\"cls_003\">báo</span></div>\n" +
            "<div style=\"position:absolute;left:247.09px;top:538.08px\" class=\"cls_003\"><span class=\"cls_003\">Tổng cộng</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:555.84px\" class=\"cls_006\"><span class=\"cls_006\">Tổng số tiền ghi bằng chữ   </span><span class=\"cls_007\"><sup>(2)</sup></span><span class=\"cls_006\">:${gnt.p17}</span></div>\n" +
            "<div style=\"position:absolute;left:71.52px;top:612.48px\" class=\"cls_002\"><span class=\"cls_002\">PHẦN DÀNH CHO KBNN GHI KHI HẠCH TOÁN:</span></div>\n" +
            "<div style=\"position:absolute;left:71.52px;top:630.24px\" class=\"cls_003\"><span class=\"cls_003\">Mã CQ thu: ………………………..</span></div>\n" +
            "<div style=\"position:absolute;left:292.32px;top:630.24px\" class=\"cls_003\"><span class=\"cls_003\">Nợ TK: …………………….</span></div>\n" +
            "<div style=\"position:absolute;left:71.52px;top:647.76px\" class=\"cls_003\"><span class=\"cls_003\">Mã ĐBHC: ………………………..</span></div>\n" +
            "<div style=\"position:absolute;left:292.32px;top:647.76px\" class=\"cls_003\"><span class=\"cls_003\">Có TK: ……………………..</span></div>\n" +
            "<div style=\"position:absolute;left:134.99px;top:684.96px\" class=\"cls_002\"><span class=\"cls_002\">NGƯỜI NỘP TIỀN</span></div>\n" +
            "<div style=\"position:absolute;left:312.38px;top:684.96px\" class=\"cls_002\"><span class=\"cls_002\">NGÂN HÀNG/ KHO BẠC NHÀ NƯỚC</span></div>\n" +
            "<div style=\"position:absolute;left:128.10px;top:696.72px\" class=\"cls_003\"><span class=\"cls_003\">Ngày... tháng... năm...</span></div>\n" +
            "<div style=\"position:absolute;left:349.38px;top:696.72px\" class=\"cls_003\"><span class=\"cls_003\">Ngày... tháng... năm...</span></div>\n" +
            "<div style=\"position:absolute;left:79.52px;top:714.48px\" class=\"cls_002\"><span class=\"cls_002\">Người nộp</span></div>\n" +
            "<div style=\"position:absolute;left:158.54px;top:714.48px\" class=\"cls_002\"><span class=\"cls_002\">Kế toán</span></div>\n" +
            "<div style=\"position:absolute;left:221.43px;top:714.48px\" class=\"cls_002\"><span class=\"cls_002\">Thủ trưởng</span></div>\n" +
            "<div style=\"position:absolute;left:301.43px;top:720.24px\" class=\"cls_002\"><span class=\"cls_002\">Thủ quỹ</span></div>\n" +
            "<div style=\"position:absolute;left:368.54px;top:720.24px\" class=\"cls_002\"><span class=\"cls_002\">Kế toán</span></div>\n" +
            "<div style=\"position:absolute;left:427.96px;top:720.24px\" class=\"cls_002\"><span class=\"cls_002\">Kế toán trưởng</span></div>\n" +
            "<div style=\"position:absolute;left:96.41px;top:726.00px\" class=\"cls_002\"><span class=\"cls_002\">tiền</span></div>\n" +
            "<div style=\"position:absolute;left:159.99px;top:726.00px\" class=\"cls_002\"><span class=\"cls_002\">trưởng</span></div>\n" +
            "<div style=\"position:absolute;left:233.65px;top:726.00px\" class=\"cls_002\"><span class=\"cls_002\">đơn vị</span></div>\n" +
            "    <div style=\"position:absolute;left:101.25px;top:483.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p4}</span></div>\n" +
            "    <div style=\"position:absolute;left:155.85px;top:483.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p5}</span></div>\n" +
            "    <div style=\"position:absolute;left:228.94px;top:483.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p6}</span></div>\n" +
            "    <div style=\"position:absolute;left:350.97px;top:483.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p7}</span></div>\n" +
            "    <div style=\"position:absolute;left:101.25px;top:500.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p8}</span></div>\n" +
            "    <div style=\"position:absolute;left:155.85px;top:500.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p9}</span></div>\n" +
            "    <div style=\"position:absolute;left:228.94px;top:500.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p10}</span></div>\n" +
            "    <div style=\"position:absolute;left:350.97px;top:500.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p11}</span></div>\n" +
            "    <div style=\"position:absolute;left:101.25px;top:520.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p12}</span></div>\n" +
            "    <div style=\"position:absolute;left:155.85px;top:520.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p13}</span></div>\n" +
            "    <div style=\"position:absolute;left:228.94px;top:520.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p14}</span></div>\n" +
            "    <div style=\"position:absolute;left:350.97px;top:520.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p15}</span></div>\n" +
            "    <div style=\"position:absolute;left:350.97px;top:540.44px\" class=\"cls_003\"><span class=\"cls_003\">${gnt.p16}</span></div>\n" +
            "</div>\n" +
            "<div style=\"position:absolute;top:852px;width:595px;height:842px;border-style:outset;overflow:hidden\">\n" +
            "<div style=\"position:absolute;left:0px;top:0px\">\n" +
            "<img src=\"f8ab87e6-7adb-11ea-8b25-0cc47a792c0a_id_f8ab87e6-7adb-11ea-8b25-0cc47a792c0a_files/background2.jpg\" width=595 height=842></div>\n" +
            "<div style=\"position:absolute;left:438.89px;top:35.28px\" class=\"cls_002\"><span class=\"cls_002\">Mẫu số: C1-02/NS</span></div>\n" +
            "<div style=\"position:absolute;left:218.16px;top:46.80px\" class=\"cls_003\"><span class=\"cls_003\">(Ban hành kèm theo Thông tư số 84/2016/TT-BTC của Bộ Tài chính)</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:113.28px\" class=\"cls_002\"><span class=\"cls_002\">Ghi chú:</span><span class=\"cls_003\"> Trường hợp nộp thuế điện tử: Người nộp tiền, Tổ chức T-VAN (nếu có), Tổng cục Thuế</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:124.80px\" class=\"cls_003\"><span class=\"cls_003\">(nếu có), Ngân hàng/ Kho bạc Nhà nước thực hiện ký số; ghi tên; ngày, giờ</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:142.56px\" class=\"cls_003\"><span class=\"cls_003\">(1) Trường hợp nộp thuế điện tử từ Cổng thông tin điện tử của Tổng cục Thuế, hệ thống tự động điền</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:154.32px\" class=\"cls_003\"><span class=\"cls_003\">số tham chiếu để phục vụ công tác quản lý.</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:172.08px\" class=\"cls_003\"><span class=\"cls_003\">(2) Trường hợp nộp tiền bằng VND thì ghi bằng chữ theo tổng số tiền VND; Trường hợp nộp tiền</span></div>\n" +
            "<div style=\"position:absolute;left:72.00px;top:183.60px\" class=\"cls_003\"><span class=\"cls_003\">bằng ngoại tệ thì ghi bằng chữ theo tổng số nguyên tệ và loại ngoại tệ.</span></div>\n" +
            "</div>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n"
}