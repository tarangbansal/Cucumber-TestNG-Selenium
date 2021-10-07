package utility.utility;

import java.util.HashMap;
import java.util.Map;

import testrunner.testrunner.EnvSetup;

public class Constant {
  protected static final String COMMAND_LOG = "commandLog";
  protected static final String SYSTEM_LOG = "systemLog";
  protected static final String SITE_BROSWER_VERSION = "sitebrowserversion";
  protected static final String SELF_SIGNED = "siteselfsigned";
  protected static final String BROSWER_TEST_URL = "https://detectmybrowser.com/";
  protected static final String SELF_SIGNED_URL = "https://self-signed.badssl.com/";
  protected static final String SITE_RESOLUTION_HEIGHT = "siteresolutionheight";
  protected static final String SITE_RESOLUTION_WIDTH = "siteresolutionwidth";
  protected static final String SITE_ORIENTATION_TEST_URL = "http://whatismyscreenresolution.net/";
  protected static final String UNBOUND_MACHINE_IP = "unboundMachineIp";
  protected static final String SITE_IP_TEST_URL = "https://nordvpn.com/what-is-my-ip/vpn-site/";
  protected static final String[] UNBOUND_SERVERS_IPS = new String[] { "54.86.87.71", "18.211.201.231", "34.194.131.11",
    "35.168.182.197", "184.72.75.204", "54.160.15.141" };
  protected static final HashMap<String, String> UNBOUND_REGION_WITH_IPS = unboundRegionWithIps();
  protected static final String SIGN_IN_URL = createUrl("accounts", "/login");
  protected static final String GEOLOCATION_TEST_URL = "https://mylocation.org/";
  protected static final String GEOLOCATION_TEST_URL2 = "https://geotargetly.com/my-ip-geolocation";
  protected static final String GEOLOCATION_TEST_URL3 = "https://ipaddress.my/";
  protected static final String GEOLOCATION_TEST_URL_IFCONFIG = "https://ifconfig.me/";
  protected static final HashMap<String, String> OS_CAPABILITY = setOSCapability();
  protected static final HashMap<String, String> BROWSER_CAPABILITY = setBrowserCapability();
  protected static final String SIGN_UP_URL = createUrl("accounts", "/register");
  protected static final String SIGN_UP_URL_API = createUrl("auth", "/api/register");
  protected static final String PROFILE_URL = createUrl("accounts", "/detail/profile");
  protected static final String FORGOT_PASSWORD_API = createUrl("auth", "/api/user/password/email-verify");
  protected static final String VERIFY_EMAIL_API = createUrl("auth", "/api/user/email/pin/verify");
  protected static final String RESEND_EMAIL_API = createUrl("auth", "/api/user/email/pin/resend");
  protected static final String RESEND_FORGOT_PASSWORD_API = createUrl("auth", "/api/user/password/resend/pin");
  protected static final String USER_DETAILS_API = createUrl("auth", "/api/user");
  protected static final String RESET_PASSWORD_VIA_DIRECT_LINK_API = createUrl("auth", "/password/reset");
  protected static final String RESET_PASSWORD_OTP_VERIFICATION_API = createUrl("auth",
    "/api/user/password/reset/pin/verify");
  protected static final String AUTH_LT_BROWSER_TOKEN_API = createUrl("auth", "/api/user/token/auth-verify");
  protected static final String AUTH_HASH_TOKEN_API = createUrl("auth", "/api/auth/hash-token");
  protected static final String AUTH_ACCESS_TOKEN_API = createUrl("auth", "/api/user/token/auth");
  protected static final String RESET_PASSWORD_API = createUrl("auth", "/api/password/reset");
  protected static final String LOGIN_API = createUrl("auth", "/api/login");
  protected static final String USER_ACCESS_TOKEN = createUrl("auth", "/api/user/token");
  protected static final String CHANGE_PASSWORD = createUrl("auth", "/api/user/password");
  protected static final String USER_PREFRENCE = createUrl("auth", "/api/user/preference");
  protected static final String UPDATE_USER_PREFRENCE = createUrl("auth", "/api/user/preference/product");
  protected static final String UPDATE_ORG = createUrl("auth", "/api/user/organization");
  protected static final String INVITE_USER_API = createUrl("auth", "/api/user/invite");

  protected static final String ONE_SEC_MAIL_LINK = "https://www.1secmail.com/api/v1/";

  protected static final String PHONE_NUMBER = "88888888888";
  protected static final String EXCEPTION = "exception";
  protected static final String AUTOMATION_DASHBOARD_URL = createUrl("automation", "");
  protected static final String AUTOMATION_SESSION_URL = createUrl("automation", "/logs/?testID=");
  protected static final String RETINA_SESSION_URL_PROD = getRatinaLink("prod");
  protected static final String RETINA_SESSION_URL_STAGE = getRatinaLink("stage");
  protected static final String HTTPS = "https://";
  protected static final String HTTP = "http://";
  protected static final String SESSION_STATUS_COMPLETED_TEXT = "Completed";
  public static final String DRIVER_PATH_KEY = "driverPath";
  protected static final String RTT_DASHBOARD_URL = createUrl("app", "/console/realtime");
  protected static final HashMap<String, String> RTT_BROWSER_NAME = rttBrowserName();
  protected static final String CLASS = "class";
  protected static final String ID = "id";
  protected static final String CSS = "css";
  protected static final String XPATH = "xpath";
  protected static final String NAME = "name";
  protected static final String TAGNAME = "tagname";
  protected static final HashMap<String, String> RTT_DASHBOARD_OS_NAMES = rttSessionOSNames();
  protected static final String AUTOMATION_API_BASE_URL_PART1 = "/automation/api/v1";
  protected static final String SESSION_API_URI_PART = "/automation/api/v1/sessions";
  protected static final String PROJECT_API_URI_PART = "/automation/api/v1/project";
  protected static final String PROJECTS_API_URI_PART = "/automation/api/v1/projects";
  protected static final String BUILDS_API_URI_PART = "/automation/api/v1/builds";
  protected static final String USER_FILES_API_URI_PART = "/automation/api/v1/user-files";
  protected static final String DELETE_USER_FILES_API_URI_PART = "/automation/api/v1/user-files/delete";
  protected static final String SESSION_API_URI_PART1 = "/automation/api/v1/sessions/";
  protected static final String MACHINE_STATUS_API_URI = createUrl("api", "/api/v1/vms?ip=");
  protected static final Map<String, String> SESSION_API_URI_PART_2 = sessionApiUriPart2();
  protected static final Map<String, String> SESSION_API_VALIDATION_SUBSTRING = sessionApiValidator();
  protected static final String USER_FILE_TO_UPLOAD_1 = "src/main/java/utility/utility/assets/Screenshot0.png";
  protected static final String USER_FILE_TO_UPLOAD_2 = "src/main/java/utility/utility/assets/Screenshot1.png";
  protected static final String USER_FILE_TO_UPLOAD_3 = "src/main/java/utility/utility/assets/Screenshot2.png";
  protected static final String GEOLOCATION = "geoLocation";
  protected static final String SESSION_ID = "sessionId";
  protected static final String URL = "url";
  protected static final String LOCATOR = "locator";
  protected static final String FILE_NAME = "sample-zip-file.zip";
  protected static final String FILE_NAME_1 = "sample.tar";
  protected static final String MD5 = "md5";
  protected static final String SIZE = "size";
  protected static final String MODIFIED_TIME = "modified_time";
  protected static final String FILE_SIZE = "380";
  protected static final String FILE_MD5 = "804ee18c10de4fd1acc77a0bfbbadc2d";
  protected static final String FILE_EXISTS = "fileStatus";
  protected static final String FILE_STATS = "fileStats";
  protected static final String FILE_LIST = "filelist";
  protected static final String NO_SPEED_TEST = "noSpeedTest";
  protected static final String NON_CHROME_LOCATOR = "non_chrome_locator";
  protected static final String CONSOLE_LOGS = "consoleLogs";
  protected static final String VIDEO = "video";
  protected static final String ACCESS_TOKEN_REGENERATE_MAX_LIMIT_TOAST_TEXT = "You have exceeded request limit. Please try again in sometime.";
  protected static final String ACCESS_TOKEN_REGENERATE_TOAST_TEXT = "Access Token generated successfully";
  protected static final String RESOLUTION = "resolution";
  protected static final String VIDEO_DOWNLOAD_DIRECTORY = "logs/imagesVideo/";
  protected static final String SCREENSHOT_DOWNLOAD_DIRECTORY = "logs/screenshots/";
  protected static final String LOGS_DIRECTORY = "logs/";
  protected static final String BROWSER_NAME_CAP = "browserName";
  protected static final String SESSION_BROWSER = "session_browser";
  protected static final String CHROME = "chrome";
  protected static final String FIREFOX = "firefox";
  protected static final String SAFARI = "safari";
  protected static final String EDGE = "edge";
  protected static final String IE = "ie";
  protected static final String OPERA = "opera";
  protected static final String YANDEX = "yandex";
  protected static final String TEST_DRIVER_SETUP_TIME = "driverSetupTime";
  protected static final String TEST_DRIVER_QUIT_TIME = "driverQuitTime";
  protected static final String TEST_DRIVER_RUN_TIME = "testRunTime";
  protected static final String DEVICE_NAME = "deviceName";
  protected static final String ALIAS_NAME = "aliasName";
  protected static final String DOWNLOAD_SPEED = "DownloadSpeed";
  protected static final String[] TEST_DRIVER_STATICS_CSV_HEADER = new String[] { SESSION_ID, DEVICE_NAME, ALIAS_NAME,
    TEST_DRIVER_SETUP_TIME, TEST_DRIVER_QUIT_TIME, DOWNLOAD_SPEED, "isLocal", "TestRunTime" };
  protected static final String[] BENCHMARKING_STATICS_CSV_HEADER = new String[] { "TestName", "Provider", "Region",
    "Setup Time", "Test Time", "Tear Time", "Status", "SessionId", DEVICE_NAME, DOWNLOAD_SPEED };
  protected static final String[] COMMAND_LOG_CSV_HEADER = new String[] { "CommandLogs" };
  protected static final String[] EXCEPTION_LOG_CSV_HEADER = new String[] { "ExceptionLogs" };
  protected static final String TEST_DRIVER_STATICS_FILE_NAME = "TestDriverStatics.csv";
  protected static final String BENCHMARKING_STATICS_FILE_NAME = "Benchmarking.csv";
  protected static final String TEST_BROWSER_TIMEZONE = "testBrowserTimezone";
  protected static final String CAP_TIMEZONE = "captimezone";
  protected static final String LT_TUNNEL_SITE = "http://localhost.lambdatest.com/dashboard/";
  protected static final String OS_NAME = "os.name";
  protected static final String WORLD_TIME_SERVER_URL = "https://www.worldtimeserver.com/";
  protected static final String NETWORK_SPEEDTEST_URL = "https://fast.com/";
  protected static final String VM_DOWN_SPEED = "vmDownloadSpeed";
  protected static final String DRIVER_STATIC_DEFAULT_VALUE = "0.00";
  protected static final String CAP_FIXIP = "fixedIP";
  protected static final String CAP_FIXIP_PORT = "fixedPort";
  protected static final String TUNNEL = "tunnel";
  protected static final String TRUE = "true";
  protected static final String ERROR_MESSAGE_404 = "404";
  protected static final String ERROR_MESSAGE_TEXT = "error";
  protected static final String FALSE = "false";
  protected static final String PLATFORM = "platform";
  protected static final String VERSION = "version";
  protected static final String TIMEZONE = "timezone";
  protected static final String PERFORMANCE = "performance";
  protected static final String SESSION_DETAILS = "sessionDetail";
  protected static final String IS_REAL_MOBILE = "isRealMobile";
  protected static final String DONT_CHECK_RESOLUTION = "dont_check_resolution";
  protected static final String APPIUM_VERSION = "appiumVersion";
  protected static final String RTTFIXIP_API_URI = createUrl("app-api", "/ltms/fixed-ip-data");
  protected static final Map<String, String> RTT_SESSION_VERIFICATION_URL = rttSessionVerficationUrl();
  protected static final String TODO_TEXT = "Yey, Let's add it to list";
  protected static final String RTT_MACHINE_STATUS_API_URI = createUrl("app-api", "/lvms/ip-status?ipv4=");
  protected static final String QE_DB_NAME = "qe";
  protected static final Map<String, String> OS_AND_BROWSER_DETAILS = getOsAndBrowserDetails();
  protected static final String ANDROID = "android";
  protected static final String SAMPLEAPP = "Sample App";
  protected static final String STARTAPP = "Starting App";
  protected static final String DEBUG = "Debug";
  protected static final String ACTIVITY = "Activity";
  protected static final String ERROR = "Error";
  protected static final String WARNING = "Warning";
  protected static final String APPLOGS = "App Logs";
  protected static final String ALL = "All";
  protected static final String HTML = "HTML";
  protected static final String S3_URL = "https://rtt-app-testing.s3.amazonaws.com/";
  protected static final String SUPPORT_URL = "https://www.lambdatest.com/support/";
  protected static final String LOCALHOST = "http://localhost:8000";
  protected static final String LOCALHOST_ANDROID = "http://10.0.2.2:8000";

  //RTT Session
  protected static final String RTT_SESSION_DEVTOOLS_FRAME = "network-devtools";
  protected static final String RTT_APP_SESSION_MARKBUG_FRAME = "nuisanceFrame";
  protected static final String RTT_APP_SESSION_TOOLBAR_ACTIVE = "toolbarButton text active";
  protected static final String RTT_APP_SESSION_TOOLBAR_INACTIVE = "toolbarButton text ";

  protected static final String PERFORMANCE_URL = "https://developers.google.com/speed/pagespeed/insights/";
  protected static final String ERROR_ICON = "errorIcon";

  // User Files
  protected static final String USER_FILES_UPLOAD_MESSAGE = "File have been uploaded successfully to our lambda storage";
  protected static final String USER_FILES_DELETE_MESSAGE = "\"File have been successfully deleted from our lambda storage\"";
  protected static final String USER_FILES_GET_MESSAGE = "files are retrieved successfully";
  protected static final String USER_FILES_NOT_EXIST_DELETE_MESSAGE = "\"File doesn't exist in lambda storage\"";

  // User Profile
  protected static final String PROFILE_UPDATED_VERIFY = "Profile Updated";
  protected static final String PROFILE_DELETE_VERIFY = "We have sent an email to Please follow the instructions to delete your account";

  // False caps 
  protected static final String COMMAND_CAPABILTY_TEXT_VERIFY = "To capture command logs use the below code into your desired capabilities";
  protected static final String SYSTEMLOG_CAPABILTY_TEXT_VERIFY = "Please set the Desired Capability \"systemLog\": true to enable selenium logs.\n" + "Learn More";
  protected static final String SYSTEMLOG_APPIUM_CAPABILTY_TEXT_VERIFY = "Please set the Desired Capability \"systemLog\": true to enable appium logs.\n" + "Learn More";

  // Lambda Clipboard Hooks
  protected static final String RETINA_URL = "https://retina.lambdatest.io";
  protected static final String RETINA_TITLE = "retinaTitle";
  protected static final String RETINA_SEARCH = "retinaSearch";
  protected static final String RETINA_GET_ALL_TEST = "retinaGetAllTests";
  protected static final String RETINA_TITLE_TEXT = "RETINA";
  protected static final String RETINA_SEARCH_TEXT = "Please Enter Query and Press Return";
  protected static final String RETINA_GET_ALL_TEST_TEXT = "Get All Tests";
  protected static final String CLIPBOARD_DATA = "getClipboard";
  protected static final String CLIPBOARD_PASTE = "^v";
  protected static final String CLIPBOARD_TAB = "{TAB}";
  protected static final String CLIPBOARD_ENTER = "{ENTER}";

  // env variable
  protected static final String CUSTOM_USER_NAME = "CUSTOM_USER_NAME";
  protected static final String CUSTOM_USER_KEY = "CUSTOM_USER_KEY";
  protected static final String CUSTOM_USER_EMAIL = "CUSTOM_USER_EMAIL";
  protected static final String CUSTOM_USER_PASS = "CUSTOM_USER_PASS";
  protected static final String CUSTOM_USER_GRID_URL = "CUSTOM_USER_GRID_URL";
  protected static final String BS_USERNAME = "BS_USERNAME";
  protected static final String BS_KEY = "BS_KEY";

  // MongoDB Details:
  protected static final String MONGODB_NAME = "myNewDatabase";
  protected static final String MONGODB_RTT_COLLECTION_NAME = "RTTSessionverification";
  protected static final String SELENIUM_VERSION_TEST_DETAILS = "Selenium_version_test_details.csv";
  protected static final String[] SELENIUM_VERSION_TEST_STATICS_CSV_HEADER = new String[] { "Platform", "BrowserName",
    "Browser_Version", "selenium_version", "Session_id", "Session_Status", "Session_Exception", "Driver_Version",
    "Given_Capabilities" };
  protected static final String[] MARKETING_METADATA_STATICS_CSV_HEADER = new String[] { "Production Url",
    "Staging Url", "Production Url Status code", "Staging Url Status code", "Production Url Metadata",
    "Staging Url Metadata", "Meta Assertion Status", "Staging Url Desktop Performance",
    "Staging Url Mobile Performance" };
  protected static final String[] MARKETING_METADATA_DOCUSAURUS_CSV_HEADER = new String[] { "Production Url",
    "Staging Url", "Production Url Status code", "Staging Url Status code", "Production Url Metadata",
    "Staging Url Metadata", "Meta Assertion Status", "Prod Texts", "Stage Texts" };
  protected static final String MARKETING_METADATA_STATICS_FILE_NAME = "Marketing.csv";

  // pricing upgrade page
  protected static final String UPGRADE_ANNUAL_SAVING_MSG = "Save up to 25% by subscribing to annual plans";
  protected static final String PLAN_HEADINGS = " Live Web Automation Web+Mobile Browser Automation";

  protected static final String LIVE_PLAN_LIST = "1 Parallel Test (5 Users)\n" + "2 Parallel Tests (10 Users)\n" + "4 Parallel Tests (25 Users)\n" + "6 Parallel Tests (30 Users)\n" + "10 Parallel Tests (50 Users)\n" + "15 Parallel Tests (50 Users)";
  protected static final String LIVE_PLAN_DETAILS = " Unlimited Realtime Browser Testing\n" + " Unlimited Screenshot Testing\n" + " Unlimited Responsive Testing\n" + " Unlimited Access to LT Browser\n" + " 24x7 Support\n" + " 3rd Party App Integrations\n" + " Free 100 Automation Minutes for 15 days";
  protected static final String WEB_AUTOMATION_PLAN_LIST = "2 Parallel Tests (10 Users)\n" + "5 Parallel Tests (25 Users)\n" + "10 Parallel Tests (50 Users)\n" + "15 Parallel Tests (50 Users)\n" + "20 Parallel Tests (50 Users)\n" + "25 Parallel Tests (50 Users)";
  protected static final String WEB_AUTOMATION_PLAN_DETAILS = " Unlimited Web Browser Automation Testing\n" + " Unlimited Realtime Browser Testing\n" + " Unlimited Screenshot Testing\n" + " Unlimited Responsive Testing\n" + " Unlimited Access to LT Browser\n" + " 24x7 Support\n" + " 3rd Party App Integrations";
  protected static final String WEB_MOBILE_AUTOMATION_PLAN_LIST = "1 Parallel Test (5 Users)\n" + "2 Parallel Tests (10 Users)\n" + "5 Parallel Tests (25 Users)\n" + "10 Parallel Tests (50 Users)\n" + "15 Parallel Tests (50 Users)\n" + "20 Parallel Tests (50 Users)\n" + "25 Parallel Tests (50 Users)";
  protected static final String WEB_MOBILE_AUTOMATION_PLAN_DETAILS = " Unlimited Web+Mobile Browser Automation Testing\n" + " Unlimited Realtime Browser Testing\n" + " Unlimited Screenshot Testing\n" + " Unlimited Responsive Testing\n" + " Unlimited Access to LT Browser\n" + " 24x7 Support\n" + " 3rd Party App Integrations";
  //Screen size list for responsive testing
  protected static final String MONITOR_SIZES[] = { "11.6\"", "12.5\"", "13.3\"", "14\"", "15.4\"", "19\"", "20\"",
    "21\"", "22\"", "24\"", "27\"", "28\"", "31.5\"" };
  //Device list for responsive testing
  protected static final String NAME_OF_DEVICES[] = { "Galaxy Note 9", "Google Pixel 3 XL", "Google Pixel 3",
    "One Plus 6T", "Galaxy S9 Plus", "iPhone XS Max", "iPhone XS", "iPhone XR", "iPhone X", "Galaxy S8+",
    "Google Pixel XL", "Google Pixel", "iPhone 8 Plus", "iPhone 8", "iPhone 7 Plus", "iPhone 7", "iPhone 6s Plus",
    "iPhone 6s", "iPhone 6 Plus", "iPhone 5s", "One Plus 3T", "Galaxy J7 max", "MotoG 2nd gen", "iPad (6th Generation)",
    "Galaxy Tab S4 10.5", "iPad Air 2", "iPad Pro", "Windows 10", "macOS Mojave" };

  protected static final String ON_DEMAND_PASS_HEADING = "On-Demand Pass";
  protected static final String ON_DEMAND_PASS_DESC = "Want to use LambdaTest platform for a shorter duration? No problem, we have you covered! Through our On-Demand Access Passes, now you can get 120 minutes of manual testing time on LambdaTest platform at $10 for 30 days.";

  // test details
  protected static final HashMap<String, String> TEST_STATUS_ICON = statusIconHash();

  //Support Pricing Url
  protected static final String SUPPORT_URL_PRICING = "https://staging.lambdatest.com/pricing";

  protected Constant() {
    super();
  }

  private static HashMap<String, String> statusIconHash() {
    HashMap<String, String> iconNameViaStatus = new HashMap<>();
    iconNameViaStatus.put(SESSION_STATUS_COMPLETED_TEXT, "completedIcon");
    iconNameViaStatus.put("Queue Timeout", "timeoutIcon");
    iconNameViaStatus.put("Running", "runningImage");
    iconNameViaStatus.put("Failed", "failedIcon");
    iconNameViaStatus.put("Idle Timeout", "timeoutIcon");
    iconNameViaStatus.put("Passed", "completedIcon");
    iconNameViaStatus.put("Error", ERROR_ICON);
    iconNameViaStatus.put("Stopped", ERROR_ICON);
    iconNameViaStatus.put("Cancelled", ERROR_ICON);
    iconNameViaStatus.put("Lambda Error", "lambdaErrorIcon");

    return iconNameViaStatus;
  }

  private static HashMap<String, String> setOSCapability() {
    HashMap<String, String> osCaps = new HashMap<>();
    osCaps.put("win10", "Windows 10");
    osCaps.put("win8.1", "Windows 8.1");
    osCaps.put("win8", "Windows 8");
    osCaps.put("win7", "Windows 7");
    osCaps.put("bigsur", "MacOS Big sur");
    osCaps.put("catalina", "MacOS Catalina");
    osCaps.put("mojave", "macOS Mojave");
    osCaps.put("high_sierra", "macOS High Sierra");
    osCaps.put("sierra", "macOS Sierra");
    osCaps.put("elcapitan", "OS X El Capitan");
    osCaps.put("yosemite", "OS X Yosemite");
    osCaps.put("mavericks", "OS X Mavericks");
    return osCaps;
  }

  private static HashMap<String, String> setBrowserCapability() {
    HashMap<String, String> browserCaps = new HashMap<>();
    browserCaps.put("chrome", "Chrome");
    browserCaps.put("firefox", "Firefox");
    browserCaps.put("edge", "MicrosoftEdge");
    browserCaps.put("safari", "Safari");
    browserCaps.put("ie", "Internet Explorer");
    browserCaps.put("opera", "Opera");
    return browserCaps;
  }

  private static HashMap<String, String> rttBrowserName() {
    HashMap<String, String> browserName = new HashMap<>();
    browserName.put("chrome", "Chrome");
    browserName.put("firefox", "Firefox");
    browserName.put("safari", "Safari");
    browserName.put("edge", "Edge");
    browserName.put("ie", "IE");
    browserName.put("opera", "Opera");
    browserName.put("yandex", "Yandex");
    return browserName;
  }

  private static HashMap<String, String> unboundRegionWithIps() {
    HashMap<String, String> unboundregion = new HashMap<>();
    unboundregion.put("ProductionEU2-PFRC", "54.86.87.71");
    unboundregion.put("ProductionEU2-PUSE2", "34.194.131.11");
    unboundregion.put("ProductionUS2-PUSE2", "35.168.182.197");
    unboundregion.put("ProductionUS2-PFRC", "184.72.75.204");
    return unboundregion;
  }

  private static HashMap<String, String> rttSessionOSNames() {
    HashMap<String, String> osName = new HashMap<>();
    osName.put("Windows 10", "Windows 10");
    osName.put("Windows 8.1", "Windows 8.1");
    osName.put("Windows 8", "Windows 8");
    osName.put("Windows 7", "Windows 7");
    osName.put("macOS Big Sur", "Mac 11.0");
    osName.put("macOS Catalina", "Mac 10.15");
    osName.put("macOS Mojave", "Mac 10.14");
    osName.put("macOS High Sierra", "Mac 10.13");
    osName.put("macOS Sierra", "Mac 10.12");
    osName.put("OS X El Capitan", "Mac 10.11");
    osName.put("OS X Yosemite", "Mac 10.10");
    osName.put("macOS Monterey", "Mac 12.0");
    return osName;
  }

  private static HashMap<String, String> sessionApiUriPart2() {
    HashMap<String, String> sessionApiUriPart2 = new HashMap<>();
    sessionApiUriPart2.put("console", "/log/console");
    sessionApiUriPart2.put("network", "/log/network");
    sessionApiUriPart2.put("selenium", "/log/selenium");
    sessionApiUriPart2.put("command", "/log/command");
    sessionApiUriPart2.put("exception", "/log/command?isExceptionLog=true");
    sessionApiUriPart2.put("cyconsole", "/log/cypress_console");
    sessionApiUriPart2.put("cycommands", "/log/cypress_json");
    sessionApiUriPart2.put(VIDEO, "/video");
    sessionApiUriPart2.put(SESSION_DETAILS, "");
    sessionApiUriPart2.put("stop", "/stop");
    return sessionApiUriPart2;
  }

  private static HashMap<String, String> sessionApiValidator() {
    HashMap<String, String> sessionApiValidator = new HashMap<>();
    sessionApiValidator.put("console", "logType");
    sessionApiValidator.put("network", "http");
    sessionApiValidator.put("selenium", "using");
    sessionApiValidator.put("command", "using");
    sessionApiValidator.put("cyconsole", "logType");
    sessionApiValidator.put("cycommands", "using");
    sessionApiValidator.put(VIDEO, "mp4");
    sessionApiValidator.put(SESSION_DETAILS, "status_ind");
    return sessionApiValidator;
  }

  private static HashMap<String, String> rttSessionVerficationUrl() {
    HashMap<String, String> rttSessionVerficationUrl = new HashMap<>();
    rttSessionVerficationUrl.put("update", "http://localhost:3000/update?testId=");
    return rttSessionVerficationUrl;
  }

  private static String createUrl(String start, String end) {
    if (EnvSetup.TEST_ENV_NAME.equalsIgnoreCase("prod") || EnvSetup.TEST_ENV_NAME.equalsIgnoreCase(
      "stage") || EnvSetup.TEST_ENV_NAME.equalsIgnoreCase("betaprod")) {
      return HTTPS + EnvSetup.TEST_ENV_URL_SUB_STR + EnvSetup.TEST_ENV_URL_SEPARATOR_STR + start + EnvSetup.TEST_ENV_BASE_URL + end;
    }
    return "";
  }

  private static String getRatinaLink(String env) {
    if (env.equalsIgnoreCase("prod")) {
      return HTTPS + "retina.lambdatest.io/search/?query=";
    } else if (env.equalsIgnoreCase("stage")) {
      return HTTPS + "stage-retina.lambdatest.io/search/?query=";
    }
    return "";
  }

  private static Map<String, String> getOsAndBrowserDetails() {
    Map<String, String> osAndBrowserDetails = new HashMap<>();
    // OS details
    osAndBrowserDetails.put("win10", "Windows 10");
    osAndBrowserDetails.put("win7", "Windows 7");
    osAndBrowserDetails.put("win8.1", "Windows 8.1");
    osAndBrowserDetails.put("win8", "Windows 8");
    osAndBrowserDetails.put("bigsur", "MacOS Big sur");
    osAndBrowserDetails.put("catalina", "MacOS Catalina");
    osAndBrowserDetails.put("elcapitan", "OS X El Capitan");
    osAndBrowserDetails.put("high_sierra", "macOS High Sierra");
    osAndBrowserDetails.put("mojave", "macOS Mojave");
    osAndBrowserDetails.put("sierra", "macOS High Sierra");
    osAndBrowserDetails.put("yosemite", "OS X Yosemite");
    // Browser details
    osAndBrowserDetails.put("chrome", "Chrome");
    osAndBrowserDetails.put("firefox", "Firefox");
    osAndBrowserDetails.put("edge", "MicrosoftEdge");
    osAndBrowserDetails.put("ie", "Internet Explorer");
    osAndBrowserDetails.put("safari", "Safari");
    osAndBrowserDetails.put("opera", "Opera");
    return osAndBrowserDetails;
  }
}
