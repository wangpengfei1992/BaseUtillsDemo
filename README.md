# BaseUtillsDemo
android常用工具栏收集，整理

引用方式：在app.gradle中添加
   dependencies {
    compile 'com.github.wangpengfei1992:BaseUtillsDemo:1.0.0'
   }



•	
AppUtils.java 应用工具类

•	
o	getAppName 获取应用名称

o	getAppIcon 获取应用图标

o	getAppFirstInstallTime 获取应用第一次安装日期

o	getAppLastUpdateTime 获取应用更新日期

o	getAppSize 获取应用大小

o	getAppApk 获取应用apk文件

o	getAppVersionName 获取应用版本名称

o	getAppVersionCode 获取应用版本号

o	getAppInstaller 获取应用的安装市场

o	getAppSign 获取应用签名

o	getAppTargetSdkVersion 获取应用兼容sdk

o	getAppUid 获取应用uid

o	getNumCores 获取Cpu内核数

o	getRootPermission 获得root权限

o	getAppPermissions 获取应用的所有权限

o	hasPermission 是否有权限

o	isInstalled 应用是否安装

o	installApk 安装应用

o	uninstallApk 卸载应用

o	isSystemApp 是否是系统应用

o	isServiceRunning 服务是否在运行

o	stopRunningService 停止服务

o	killProcesses 结束进程

o	runScript 运行脚本

o	runApp 启动应用

o	cleanCache 清除应用内部缓存

o	cleanDatabases 清除应用内部数据库

o	cleanSharedPreference 清除应用内部SP
•	

CacheUtils.java 缓存工具类

•	
o	setCache 设置缓存

o	getCache 获取缓存

•	
CipherUtils.java 密码工具类

•	
o	md5(String input) 字符串md5

o	md5L(String input) 字符串md5,返回小写密文

o	md5(InputStream in) 输入流md5

o	base64Encode Base64加密

o	base64Decode Base64解密

o	XorEncode 异或加密

o	XorDecode 异或解密

o	sha1 字符串sha1值

o	sha1 文件hash校验

•	
CoordinateTransformUtil.java GPS坐标转换工具

•	
o	百度坐标（BD09）、国测局坐标（火星坐标，GCJ02）、和WGS84坐标系之间的转换的工具

o	bd09towgs84 百度坐标系(BD-09)转WGS坐标(百度坐标纬度,百度坐标经度),WGS84坐标数组

o	wgs84tobd09 WGS坐标转百度坐标系(BD-09)(WGS84坐标系的经度,WGS84坐标系的纬度),百度坐标数组

o	gcj02tobd09 火星坐标系(GCJ-02)转百度坐标系(BD-09)(火星坐标经度,火星坐标纬度),百度坐标数组

o	bd09togcj02 百度坐标系(BD-09)转火星坐标系(GCJ-02)(百度坐标纬度,百度坐标经度),火星坐标数组

o	wgs84togcj02 WGS84转GCJ02(火星坐标系)(WGS84坐标系的经度,WGS84坐标系的纬度),火星坐标数组

o	gcj02towgs84 GCJ02(火星坐标系)转GPS84(火星坐标系的经度,火星坐标系纬度),WGS84坐标数组

o	transformlat 纬度转换

o	transformlng 经度转换

o	out_of_china 判断是否在国内，不在国内不做偏移

•	
DateUtil.java 日期工具类

•	
o	formatDataTime 格式化日期时间

o	formatDate 格式化日期

o	formatTime 格式化时间

o	formatDateCustom 自定义格式的格式化日期时间

o	string2Date 将时间字符串转换成Date

o	getDate 获取系统日期

o	getTime 获取系统时间

o	getDateTime 获取系统日期时间

o	subtractDate 计算两个时间差

o	getDateAfter 得到几天后的时间

o	getWeekOfMonth 获取当前时间为本月的第几周

o	getDayOfWeek 获取当前时间为本周的第几天

•	
DensityUtil.java 屏幕工具类

•	
o	dip2px dp转像素

o	dip2sp dip转sp

o	px2dip 像素转dp

o	px2sp 像素转sp

o	sp2px sp转像素

o	sp2dip sp转dip

o	getScreenW 获取屏幕宽度

o	getScreenH 获取屏幕高度

o	getScreenRealSize 获取屏幕的真实高度

o	getStatusBarH 获取状态栏高度

o	getNavigationBarrH 获取导航栏高度

•	
DeviceUtils.java 设备信息工具

•	
o	getAndroidID 获取AndroidID

o	getIMEI 获取设备IMEI码

o	getIMSI 获取设备IMSI码

o	getWifiMacAddr 获取MAC地址

o	getIP 获取网络IP地址(优先获取wifi地址)

o	getWifiIP 获取WIFI连接下的ip地址

o	getGPRSIP 获取GPRS连接下的ip地址

o	getSerial 获取设备序列号

o	getSIMSerial 获取SIM序列号

o	getMNC 获取网络运营商 46000,46002,46007 中国移动,46001 中国联通,46003 中国电信

o	getCarrier 获取网络运营商：中国电信,中国移动,中国联通

o	getModel 获取硬件型号

o	getBuildBrand 获取编译厂商

o	getBuildHost 获取编译服务器主机

o	getBuildTags 获取描述Build的标签

o	getBuildTime 获取系统编译时间

o	getBuildUser 获取系统编译作者

o	getBuildVersionRelease 获取编译系统版本(5.1)

o	getBuildVersionCodename 获取开发代号

o	getBuildVersionIncremental 获取源码控制版本号

o	getBuildVersionSDK 获取编译的SDK

o	getBuildID 获取修订版本列表(LMY47D)

o	getSupportedABIS CPU指令集

o	getManufacturer 获取硬件制造厂商

o	getBootloader 获取系统启动程序版本号

o	getScreenDisplayID

o	getDisplayVersion 获取系统版本号

o	getLanguage 获取语言

o	getCountry 获取国家

o	getOSVersion 获取系统版本:5.1.1

o	getGSFID 获取GSF序列号

o	getBluetoothMAC 获取蓝牙地址

o	getPsuedoUniqueID Android设备物理唯一标识符

o	getFingerprint 构建标识,包括brand,name,device,version.release,id,version.incremental,type,tags这些信息

o	getHardware 获取硬件信息

o	getProduct 获取产品信息

o	getDevice 获取设备信息

o	getBoard 获取主板信息

o	getRadioVersion 获取基带版本(无线电固件版本 Api14以上)

o	getUA 获取的浏览器指纹(User-Agent)

o	getDensity 获取得屏幕密度

o	getGoogleAccounts 获取google账号

•	
FileUtils.java 文件工具类

•	
o	closeIO 关闭IO流

o	isFileExist 文件是否存在

o	writeFile 将字符串写入到文件

o	readFile 从文件中读取字符串

o	readFile 从文件中读取字符串(可设置编码)

o	copyFile 复制文件

o	copyFileFast 快速复制

o	shareFile 分享文件

o	zip zip压缩

o	unzip zip解压

o	formatFileSize 格式化文件大小

o	Stream2File 将输入流写入到文件

o	createFolder 创建文件夹

o	createFolder 创建文件夹(支持覆盖已存在的同名文件夹)

o	getFileName 获取文件名

o	getFileSize 获取文件大小

o	rename 重名名文件\文件夹

o	getFolderName 获取文件夹名称

o	getFilesArray 获取文件夹下所有文件

o	deleteFile 删除文件

o	deleteFileByDirectory 删除目录下的所有文件

o	openImage 打开图片

o	openVideo 打开视频

o	openURL 打开URL

o	downloadFile 下载文件

o	upgradeApp 通过APKURL升级应用

o	isSDCardAvailable 是否挂在SDCard

o	getAppExternalPath 获取应用在SDCard上的工作路径

o	getExtraPath 获取SDCard上目录的路径

•	
JsonUtils.java Json工具类(需要依赖Gson 2.0以上)

•	
o	toJson 对象转json

o	fromJson json转对象

o	mapToJson Map转为JSONObject

o	collection2Json 集合转换为JSONArray

o	object2Json Object对象转换为JSONArray

o	string2JSONObject json字符串生成JSONObject对象

•	
L.java 日志工具

•	
o	init 初始化日志开关和TAG(默认日志为开,TAG为"ghost")

o	v VERBOSE

o	d DEBUG

o	i INFO

o	w WARN

o	e ERROR

o	a ASSERT

o	json 输出json

o	xml 输出xml

•	
NetUtils.java 网络工具

•	
o	getNetworkType 获取网络类型

o	getNetworkTypeName 获取网络名称

o	isConnected 检查网络状态

o	isNetworkAvailable 网络可用性

o	isWiFi 是否wifi

o	openNetSetting 打开网络设置界面

o	setWifiEnabled 设置wifi状态

o	setDataEnabled 设置数据流量状态

o	getWifiScanResults 获取wifi列表

o	getScanResultsByBSSID 过滤扫描结果

o	getWifiConnectionInfo 获取wifi连接信息

•	
SPUtils.java SharedPreferences工具

•	
o	setSP 存储SharedPreferences值

o	getSp 获取SharedPreferences值

o	cleanAllSP 清除所有的SP值

•	
StringUtils.java 字符串工具

•	
o	getChsAscii 汉字转成ASCII码

o	convert 单字解析

o	getSelling 词组解析

o	parseEmpty 将null转化为""

o	isEmpty 是否是空字符串

o	chineseLength 中文长度

o	strLength 字符串长度

o	subStringLength 获取指定长度的字符所在位置

o	isChinese 是否是中文

o	isContainChinese 是否包含中文

o	strFormat2 不足2位前面补0

o	convert2Int 类型安全转换

o	decimalFormat 指定小数输出

•	
SystemUtils.java 系统工具

•	
o	sendSMS 调用系统发送短信

o	forwardToDial 跳转到拨号

o	callPhone 直接呼叫号码

o	sendMail 发邮件

o	openWeb 打开浏览器

o	openContacts 打开联系人

o	openSettings 打开系统设置

/**
 * com.android.settings.AccessibilitySettings 辅助功能设置
 * com.android.settings.ActivityPicker 选择活动
 * com.android.settings.ApnSettings APN设置
 * com.android.settings.ApplicationSettings 应用程序设置
 * com.android.settings.BandMode 设置GSM/UMTS波段
 * com.android.settings.BatteryInfo 电池信息
 * com.android.settings.DateTimeSettings 日期和时间设置
 * com.android.settings.DateTimeSettingsSetupWizard 日期和时间设置
 * com.android.settings.DevelopmentSettings 应用程序设置=》开发设置
 * com.android.settings.DeviceAdminSettings 设备管理器
 * com.android.settings.DeviceInfoSettings 关于手机
 * com.android.settings.Display 显示——设置显示字体大小及预览
 * com.android.settings.DisplaySettings 显示设置
 * com.android.settings.DockSettings 底座设置
 * com.android.settings.IccLockSettings SIM卡锁定设置
 * com.android.settings.InstalledAppDetails 语言和键盘设置
 * com.android.settings.LanguageSettings 语言和键盘设置
 * com.android.settings.LocalePicker 选择手机语言
 * com.android.settings.LocalePickerInSetupWizard 选择手机语言
 * com.android.settings.ManageApplications 已下载（安装）软件列表
 * com.android.settings.MasterClear 恢复出厂设置
 * com.android.settings.MediaFormat 格式化手机闪存
 * com.android.settings.PhysicalKeyboardSettings 设置键盘
 * com.android.settings.PrivacySettings 隐私设置
 * com.android.settings.ProxySelector 代理设置
 * com.android.settings.RadioInfo 手机信息
 * com.android.settings.RunningServices 正在运行的程序（服务）
 * com.android.settings.SecuritySettings 位置和安全设置
 * com.android.settings.Settings 系统设置
 * com.android.settings.SettingsSafetyLegalActivity 安全信息
 * com.android.settings.SoundSettings 声音设置
 * com.android.settings.TestingSettings 测试——显示手机信息、电池信息、使用情况统计、Wifi
 * information、服务信息 com.android.settings.TetherSettings 绑定与便携式热点
 * com.android.settings.TextToSpeechSettings 文字转语音设置
 * com.android.settings.UsageStats 使用情况统计
 * com.android.settings.UserDictionarySettings 用户词典
 * com.android.settings.VoiceInputOutputSettings 语音输入与输出设置
 * com.android.settings.WirelessSettings 无线和网络设置
 */
* hideKeyBoard 隐藏系统键盘
* isBackground 判断当前应用程序是否后台运行
* isSleeping 判断手机是否处理睡眠
* installApk 安装apk
* isRooted 是否root
* isRunningOnEmulator 当前设备是否是模拟器
* goHome 返回Home
* hexdigest 32位签名
* getDeviceUsableMemory 获取设备可用空间
* gc 清理后台进程和服务
* getProcessName 获取进程名字
* createDeskShortCut 创建桌面快捷方式
* createShortcut 创建快捷方式
* shareText 分享文本
* shareFile 分享文件(此方法是调用FileUtils.shareFile中的方式)
* getShareTargets 获取可接受分享的应用
* getCurrentLanguage 获取当前系统的语言 
* getLanguage 获取当前系统的语言
* isGpsEnabled GPS是否打开
* showSoftInputMethod 显示软键盘
* closeSoftInputMethod 关闭软键盘
* showSoftInput 显示软键盘
* closeSoftInput 关闭软键盘
* toWeChatScan 打开微信扫描
* toAliPayScan 打开支付宝扫描
* toAliPayPayCode 打开支付宝支付码
* getRandomNumber 获取随机数

•	
VerificationUtils.java 验证工具类

•	
o	matcherRealName 判断姓名格式

真实姓名可以是汉字,也可以是字母,但是不能两者都有,也不能包含任何符号和数字

1.如果是英文名,可以允许英文名字中出现空格

2.英文名的空格可以是多个,但是不能连续出现多个

3.汉字不能出现空格

o	matcherPhoneNum 判断手机号格式 (匹配11数字,并且13-19开头)

o	matcherAccount 判断账号格式 (4-20位字符)

o	matcherPassword 判断密码格式 (6-12位字母或数字)

o	matcherPassword2 判断密码格式 (6-12位字母或数字,必须同时包含字母和数字)

o	matcherEmail 判断邮箱格式

o	matcherIP 判断IP地址

o	matcherUrl 判断URL (http,https,ftp)

o	matcherVehicleNumber 判断中国民用车辆号牌

o	matcherIdentityCard 判断身份证号码格式

o	isNumeric 是否数值型

o	testRegex 是否匹配正则

o	checkPostcode 匹配中国邮政编码

•	
ViewUtils.java View工具

•	
o	removeSelfFromParent

o	requestLayoutParent

o	isTouchInView

o	bigImage

o	setTVUnderLine 给TextView设置下划线

o	showPopupWindow

o	dismissPopup

o	captureView 截图

o	createViewBitmap 截图

o	convertViewToBitmap 截图

o	getActivityBitmap 获取Activity的截图

o	getStatusBarHeight 获取状态栏高度

o	getToolbarHeight 获取工具栏高度

o	getNavigationBarHeight 获取导航栏高度

o	measureView 测量view

o	getViewWidth 获取view的宽度

o	getViewHeight 获取view的高度

o	getActivity 获取view的上下文

    /**
     * 身份证校验
     * <p>
     * 根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定,公民身份号码是特征组合码,由十七位数字本体码和一位数字校验码组成。
     * 排列顺序从左至右依次为：六位数字地址码,八位数字出生日期码,三位数字顺序码和一位数字校验码。
     * 地址码表示编码对象常住户口所在县(市、旗、区)的行政区划代码。
     * 出生日期码表示编码对象出生的年、月、日,其中年份用四位数字表示,年、月、日之间不用分隔符。
     * 顺序码表示同一地址码所标识的区域范围内,对同年、月、日出生的人员编定的顺序号。顺序码的奇数分给男性,偶数分给女性。
     * 校验码是根据前面十七位数字码,按照ISO 7064:1983.MOD 11-2校验码计算出来的检验码。
     * 出生日期计算方法。
     * 15位的身份证编码首先把出生年扩展为4位,简单的就是增加一个19或18,这样就包含了所有1800-1999年出生的人;
     * 2000年后出生的肯定都是18位的了没有这个烦恼,至于1800年前出生的,那啥那时应该还没身份证号这个东东,⊙﹏⊙b汗...
     * 下面是正则表达式:
     * 出生日期1800-2099  /(18|19|20)?\d{2}(0[1-9]|1[012])(0[1-9]|[12]\d|3[01])/
     * 身份证正则表达式 /^[1-9]\d{5}((1[89]|20)\d{2})(0[1-9]|1[0-2])(0[1-9]|[12]\d|3[01])\d{3}[\dx]$/i     * 15位校验规则 6位地址编码+6位出生日期+3位顺序号     * 18位校验规则 6位地址编码+8位出生日期+3位顺序号+1位校验位     * 校验位规则     公式:∑(ai×Wi)(mod 11)……………………………………(1)     * 公式(1)中：     * i----表示号码字符从由至左包括校验码在内的位置序号;     * ai----表示第i位置上的号码字符值；     * Wi----示第i位置上的加权因子,其数值依据公式Wi=2^(n-1）(mod 11)计算得出。     * i 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1     * Wi 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 1

