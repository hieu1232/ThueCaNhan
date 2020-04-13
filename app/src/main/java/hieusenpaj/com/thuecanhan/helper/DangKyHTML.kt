package hieusenpaj.com.thuecanhan.helper

import android.webkit.WebView
import hieusenpaj.com.thuecanhan.`object`.DangKy

inline fun DangKyHTML(dangKy: DangKy)  :String{
//    val name = "$s"
    val string = "<html>\n" +
            "\n" +
            "<head>\n" +
            "        <meta http-equiv=Content-Type content=\"text/html; charset=UTF-8\">\n" +
            "        <style type=\"text/css\">\n" +
            "                <!--\n" +
            "                span.cls_003 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 11.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_003 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 11.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                span.cls_004 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 11.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: bold;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_004 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 11.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: bold;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                span.cls_005 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 11.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: italic;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_005 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 11.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: italic;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                span.cls_006 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 12.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: bold;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_006 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 12.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: bold;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                span.cls_007 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 13.0px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: bold;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_007 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 13.0px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: bold;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                span.cls_008 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 12.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: italic;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_008 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 12.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: italic;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                span.cls_009 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 12.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_009 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 12.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                span.cls_002 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 9.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "\n" +
            "                div.cls_002 {\n" +
            "                        font-family: Times, serif;\n" +
            "                        font-size: 9.1px;\n" +
            "                        color: rgb(0, 0, 0);\n" +
            "                        font-weight: normal;\n" +
            "                        font-style: normal;\n" +
            "                        text-decoration: none\n" +
            "                }\n" +
            "                -->\n" +
            "        </style>\n" +
            "        <script type=\"text/javascript\"\n" +
            "                src=\"febed57a-77d9-11ea-8b25-0cc47a792c0a_id_febed57a-77d9-11ea-8b25-0cc47a792c0a_files/wz_jsgraphics.js\"></script>\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "        <div\n" +
            "                style=\"position:absolute;top:0px;width:595px;height:842px;border-style:outset;overflow:hidden\">\n" +
            "                <div style=\"position:absolute;left:0px;top:0px\">\n" +
            "                        <img src=\"febed57a-77d9-11ea-8b25-0cc47a792c0a_id_febed57a-77d9-11ea-8b25-0cc47a792c0a_files/background1.jpg\"\n" +
            "                                width=595 height=842></div>\n" +
            "                <div style=\"position:absolute;left:412.20px;top:25.00px\" class=\"cls_003\"><span class=\"cls_003\">Mẫu\n" +
            "                                số:</span><span class=\"cls_004\"> 01/ĐK-TĐT</span></div>\n" +
            "                <div style=\"position:absolute;left:394.44px;top:36.28px\" class=\"cls_005\"><span class=\"cls_005\">(Ban hành\n" +
            "                                kèm\n" +
            "                                theo Thông tư</span></div>\n" +
            "                <div style=\"position:absolute;left:390.84px;top:47.68px\" class=\"cls_005\"><span class=\"cls_005\">số\n" +
            "                                110/TT-BTC\n" +
            "                                ngày 28/7/2015</span></div>\n" +
            "                <div style=\"position:absolute;left:420.24px;top:59.08px\" class=\"cls_005\"><span class=\"cls_005\">của Bộ\n" +
            "                                Tài\n" +
            "                                chính)</span></div>\n" +
            "                <div style=\"position:absolute;left:187.56px;top:79.85px\" class=\"cls_006\"><span class=\"cls_006\">CỘNG HOÀ\n" +
            "                                XÃ HỘI\n" +
            "                                CHỦ NGHĨA VIỆT NAM</span></div>\n" +
            "                <div style=\"position:absolute;left:238.68px;top:94.25px\" class=\"cls_006\"><span class=\"cls_006\">Độc lập -\n" +
            "                                Tự do -\n" +
            "                                Hạnh phúc</span></div>\n" +
            "                <div style=\"position:absolute;left:278.64px;top:129.30px\" class=\"cls_007\"><span class=\"cls_007\">TỜ\n" +
            "                                KHAI</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:140.28px;top:144.30px\" class=\"cls_007\"><span class=\"cls_007\">Đăng ký\n" +
            "                                giao\n" +
            "                                dịch với cơ quan thuế bằng phương thức điện tử</span></div>\n" +
            "                <div style=\"position:absolute;left:205.08px;top:171.65px\" class=\"cls_008\">\n" +
            "                        <input type=\"checkbox\" disabled>\n" +
            "                        <span class=\"cls_008\">Tổ chức</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:333.84px;top:171.65px\" class=\"cls_008\">\n" +
            "                        <input type=\"checkbox\" checked=\"true\" disabled>\n" +
            "                        <span class=\"cls_008\">Cá nhân</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:193.08px;top:197.45px\" class=\"cls_006\"><span class=\"cls_006\">Kính\n" +
            "                                gửi:</span><span class=\"cls_008\"> &lt;Tổng cục Thuế</span><span class=\"cls_009\">></span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:221.45px\" class=\"cls_009\" ><span id=\"name\" class=\"cls_009\">Tên người\n" +
            "                                nộp\n" +
            "                                thuế:${dangKy.name}</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:245.33px\" class=\"cls_009\"><span class=\"cls_009\">Mã số\n" +
            "                                thuế:${dangKy.mst}</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:269.33px\" class=\"cls_009\"><span class=\"cls_009\">Địa\n" +
            "                                chỉ:${dangKy.address}</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:293.21px\" class=\"cls_009\"><span class=\"cls_009\">Xét các\n" +
            "                                điều kiện\n" +
            "                                thực hiện giao dịch điện tử trong lĩnh vực thuế, chúng tôi nhận thấy có đủ</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:311.21px\" class=\"cls_009\"><span class=\"cls_009\">điều kiện\n" +
            "                                giao\n" +
            "                                dịch với cơ quan thuế bằng phương thức điện tử. Chúng tôi đăng ký với cơ</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:329.09px\" class=\"cls_009\"><span class=\"cls_009\">quan thuế\n" +
            "                                để sử\n" +
            "                                dụng giao dịch thuế điện tử với các thông tin như sau:</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:353.09px\" class=\"cls_006\"><span class=\"cls_006\">I. THÔNG\n" +
            "                                TIN\n" +
            "                                NGƯỜI NỘP THUẾ</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:370.97px\" class=\"cls_009\"><span class=\"cls_009\">1. Thời\n" +
            "                                gian đề\n" +
            "                                nghị được áp dụng từ: ngày….. tháng</span></div>\n" +
            "                <div style=\"position:absolute;left:371.04px;top:370.97px\" class=\"cls_009\"><span\n" +
            "                                class=\"cls_009\">năm</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:388.97px\" class=\"cls_009\"><span class=\"cls_009\">2. Thông\n" +
            "                                tin đăng\n" +
            "                                ký chứng thư số sử dụng giao dịch thuế điện tử:</span></div>\n" +
            "                <div style=\"position:absolute;left:130.80px;top:419.33px\" class=\"cls_009\"><span class=\"cls_009\">Tên tổ\n" +
            "                                chức/cơ</span></div>\n" +
            "                <div style=\"position:absolute;left:347.64px;top:419.33px\" class=\"cls_009\"><span class=\"cls_009\">Thời hạn\n" +
            "                                sử\n" +
            "                                dụng</span></div>\n" +
            "                <div style=\"position:absolute;left:470.40px;top:426.17px\" class=\"cls_009\"><span class=\"cls_009\">Thủ tục\n" +
            "                                thuế</span></div>\n" +
            "                <div style=\"position:absolute;left:138.60px;top:433.13px\" class=\"cls_009\"><span class=\"cls_009\">quan\n" +
            "                                chứng</span></div>\n" +
            "                <div style=\"position:absolute;left:228.72px;top:433.13px\" class=\"cls_009\"><span class=\"cls_009\">Số sê-ri\n" +
            "                                chứng\n" +
            "                                thư</span></div>\n" +
            "                <div style=\"position:absolute;left:358.68px;top:433.13px\" class=\"cls_009\"><span class=\"cls_009\">chứng\n" +
            "                                thư\n" +
            "                                số</span></div>\n" +
            "                <div style=\"position:absolute;left:85.20px;top:439.97px\" class=\"cls_009\"><span\n" +
            "                                class=\"cls_009\">STT</span></div>\n" +
            "                <div style=\"position:absolute;left:463.32px;top:439.97px\" class=\"cls_009\"><span class=\"cls_009\">điện tử\n" +
            "                                đăng\n" +
            "                                ký</span></div>\n" +
            "                <div style=\"position:absolute;left:119.76px;top:446.93px\" class=\"cls_009\"><span\n" +
            "                                class=\"cls_009\">thực/cấp/công\n" +
            "                                nhận</span></div>\n" +
            "                <div style=\"position:absolute;left:267.60px;top:446.81px\" class=\"cls_009\"><span\n" +
            "                                class=\"cls_009\">số</span></div>\n" +
            "                <div style=\"position:absolute;left:481.56px;top:453.77px\" class=\"cls_009\"><span class=\"cls_009\">sử\n" +
            "                                dụng</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:337.92px;top:457.25px\" class=\"cls_009\"><span class=\"cls_009\">Từ\n" +
            "                                ngày</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:399.84px;top:457.25px\" class=\"cls_009\"><span class=\"cls_009\">đến\n" +
            "                                ngày</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:143.40px;top:460.73px\" class=\"cls_009\"><span class=\"cls_009\">chữ ký\n" +
            "                                số</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:516.65px\" class=\"cls_008\"><span class=\"cls_008\">(Trường\n" +
            "                                hợp người\n" +
            "                                nộp thuế là cá nhân không có chứng thư số thì không bắt buộc khai báo</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:534.65px\" class=\"cls_008\"><span class=\"cls_008\">phần\n" +
            "                                này)</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:552.53px\" class=\"cls_009\"><span class=\"cls_009\">3. Thông\n" +
            "                                tin đăng\n" +
            "                                ký tài khoản thực hiện thủ tục nộp thuế điện tử:</span></div>\n" +
            "                <div style=\"position:absolute;left:460.20px;top:583.01px\" class=\"cls_009\"><span class=\"cls_009\">Tên tổ\n" +
            "                                chức/cơ</span></div>\n" +
            "                <div style=\"position:absolute;left:389.16px;top:596.69px\" class=\"cls_009\"><span class=\"cls_009\">Số\n" +
            "                                sê-ri</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:468.12px;top:596.69px\" class=\"cls_009\"><span class=\"cls_009\">quan\n" +
            "                                chứng</span></div>\n" +
            "                <div style=\"position:absolute;left:86.88px;top:603.65px\" class=\"cls_009\"><span\n" +
            "                                class=\"cls_009\">STT</span></div>\n" +
            "                <div style=\"position:absolute;left:126.96px;top:603.65px\" class=\"cls_009\"><span class=\"cls_009\">Số tài\n" +
            "                                khoản</span></div>\n" +
            "                <div style=\"position:absolute;left:210.24px;top:603.65px\" class=\"cls_009\"><span class=\"cls_009\">Tên tài\n" +
            "                                khoản</span></div>\n" +
            "                <div style=\"position:absolute;left:302.04px;top:603.65px\" class=\"cls_009\"><span class=\"cls_009\">Ngân\n" +
            "                                hàng</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:376.44px;top:610.49px\" class=\"cls_009\"><span class=\"cls_009\">chứng\n" +
            "                                thư\n" +
            "                                số</span></div>\n" +
            "                <div style=\"position:absolute;left:462.36px;top:610.49px\" class=\"cls_009\"><span\n" +
            "                                class=\"cls_009\">thực/cấp/công</span></div>\n" +
            "                <div style=\"position:absolute;left:459.72px;top:624.29px\" class=\"cls_009\"><span class=\"cls_009\">nhận chữ\n" +
            "                                ký\n" +
            "                                số</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:692.09px\" class=\"cls_009\"><span class=\"cls_009\">4. Địa\n" +
            "                                chỉ thư\n" +
            "                                điện tử:</span></div>\n" +
            "                <div style=\"position:absolute;left:84.84px;top:709.97px\" class=\"cls_009\"><span class=\"cls_009\">4.1. Địa\n" +
            "                                chỉ thư\n" +
            "                                điện tử chính thức nhận tất cả các thông báo trong quá trình thực hiện giao</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:727.97px\" class=\"cls_009\"><span class=\"cls_009\">dịch điện\n" +
            "                                tử với\n" +
            "                                cơ quan thuế:${dangKy.email}</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:745.85px\" class=\"cls_009\"><span class=\"cls_009\">4.2. Địa\n" +
            "                                chỉ thư\n" +
            "                                điện tử bổ sung theo mỗi thủ tục hành chính thuế:</span></div>\n" +
            "                <div style=\"position:absolute;left:307.32px;top:784.61px\" class=\"cls_002\"><span\n" +
            "                                class=\"cls_002\">32</span></div>\n" +
            "        </div>\n" +
            "        <div\n" +
            "                style=\"position:absolute;top:842px;width:595px;height:842px;border-style:outset;overflow:hidden\">\n" +
            "                <div style=\"position:absolute;left:0px;top:0px\">\n" +
            "                        <img src=\"febed57a-77d9-11ea-8b25-0cc47a792c0a_id_febed57a-77d9-11ea-8b25-0cc47a792c0a_files/background2.jpg\"\n" +
            "                                width=595 height=842></div>\n" +
            "                <div style=\"position:absolute;left:437.04px;top:26.93px\" class=\"cls_009\"><span class=\"cls_009\">Thủ tục\n" +
            "                                thuế điện\n" +
            "                                tử</span></div>\n" +
            "                <div style=\"position:absolute;left:93.00px;top:33.77px\" class=\"cls_009\"><span class=\"cls_009\">STT</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:146.40px;top:33.77px\" class=\"cls_009\"><span class=\"cls_009\">Địa chỉ\n" +
            "                                thư điện\n" +
            "                                tử</span></div>\n" +
            "                <div style=\"position:absolute;left:288.00px;top:33.77px\" class=\"cls_009\"><span class=\"cls_009\">Họ tên\n" +
            "                                người sử\n" +
            "                                dụng</span></div>\n" +
            "                <div style=\"position:absolute;left:445.80px;top:40.73px\" class=\"cls_009\"><span class=\"cls_009\">đăng ký\n" +
            "                                sử\n" +
            "                                dụng</span></div>\n" +
            "                <div style=\"position:absolute;left:453.24px;top:67.01px\" class=\"cls_009\"><span class=\"cls_009\">Đăng ký\n" +
            "                                thuế</span></div>\n" +
            "                <div style=\"position:absolute;left:462.00px;top:93.29px\" class=\"cls_009\"><span class=\"cls_009\">Khai\n" +
            "                                thuế</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:463.32px;top:119.57px\" class=\"cls_009\"><span class=\"cls_009\">Nộp\n" +
            "                                thuế</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:460.68px;top:145.85px\" class=\"cls_009\"><span class=\"cls_009\">Hoàn\n" +
            "                                thuế</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:84.60px;top:172.25px\" class=\"cls_009\"><span class=\"cls_009\">5. Số\n" +
            "                                điện\n" +
            "                                thoại:${dangKy.sdt}</span></div>\n" +
            "                <div style=\"position:absolute;left:84.60px;top:196.13px\" class=\"cls_006\"><span class=\"cls_006\">II. XÁC\n" +
            "                                NHẬN CỦA\n" +
            "                                NGƯỜI NỘP THUẾ</span></div>\n" +
            "                <div style=\"position:absolute;left:84.60px;top:220.13px\" class=\"cls_009\"><span class=\"cls_009\">Chúng tôi\n" +
            "                                cam kết\n" +
            "                                nhận các phản hồi, thông báo của cơ quan thuế bằng phương thức điện tử.</span></div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:238.01px\" class=\"cls_009\"><span class=\"cls_009\">Chúng tôi\n" +
            "                                chịu\n" +
            "                                trách nhiệm về tính hợp pháp, đầy đủ, chính xác với các thông tin đăng ký nêu</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:85.08px;top:255.89px\" class=\"cls_009\"><span\n" +
            "                                class=\"cls_009\">trên./.</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:363.00px;top:280.37px\" class=\"cls_008\"><span\n" +
            "                                class=\"cls_008\">................., ngày</span></div>\n" +
            "                <div style=\"position:absolute;left:457.68px;top:280.37px\" class=\"cls_008\"><span\n" +
            "                                class=\"cls_008\">tháng</span>\n" +
            "                </div>\n" +
            "                <div style=\"position:absolute;left:500.04px;top:280.37px\" class=\"cls_008\"><span\n" +
            "                                class=\"cls_008\">năm</span></div>\n" +
            "                <div style=\"position:absolute;left:338.04px;top:304.85px\" class=\"cls_006\"><span class=\"cls_006\">NGƯỜI\n" +
            "                                NỘP THUẾ\n" +
            "                                hoặc</span></div>\n" +
            "                <div style=\"position:absolute;left:276.84px;top:322.73px\" class=\"cls_006\"><span class=\"cls_006\">ĐẠI DIỆN\n" +
            "                                HỢP\n" +
            "                                PHÁP CỦA NGƯỜI NỘP THUẾ</span></div>\n" +
            "                <div style=\"position:absolute;left:328.44px;top:340.73px\" class=\"cls_008\"><span class=\"cls_008\">(Chữ ký\n" +
            "                                số của\n" +
            "                                người nộp thuế)</span></div>\n" +
            "                <div style=\"position:absolute;left:307.32px;top:784.61px\" class=\"cls_002\"><span\n" +
            "                                class=\"cls_002\">33</span></div>\n" +
            "        </div>\n" +
            "\n" +
            "</body>\n" +
            "\n" +
            "</html>"

    return string
}