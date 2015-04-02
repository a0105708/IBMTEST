
package wss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wss package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeletePurchaseHistory_QNAME = new QName("http://WSS/", "deletePurchaseHistory");
    private final static QName _ActivateAccount_QNAME = new QName("http://WSS/", "activateAccount");
    private final static QName _CheckAccountResponse_QNAME = new QName("http://WSS/", "checkAccountResponse");
    private final static QName _MemberLoginResponse_QNAME = new QName("http://WSS/", "memberLoginResponse");
    private final static QName _CheckAccount_QNAME = new QName("http://WSS/", "checkAccount");
    private final static QName _MemberChangePassword_QNAME = new QName("http://WSS/", "memberChangePassword");
    private final static QName _UnblockMemberResponse_QNAME = new QName("http://WSS/", "unblockMemberResponse");
    private final static QName _EmailActivationCode_QNAME = new QName("http://WSS/", "emailActivationCode");
    private final static QName _AdminLoginResponse_QNAME = new QName("http://WSS/", "adminLoginResponse");
    private final static QName _EditAccountInfoResponse_QNAME = new QName("http://WSS/", "editAccountInfoResponse");
    private final static QName _AdminAccountInfo_QNAME = new QName("http://WSS/", "adminAccountInfo");
    private final static QName _BlockMember_QNAME = new QName("http://WSS/", "blockMember");
    private final static QName _AdminLogin_QNAME = new QName("http://WSS/", "adminLogin");
    private final static QName _ChangePassword_QNAME = new QName("http://WSS/", "changePassword");
    private final static QName _UnblockMember_QNAME = new QName("http://WSS/", "unblockMember");
    private final static QName _AccountInfo_QNAME = new QName("http://WSS/", "accountInfo");
    private final static QName _AdminAccountInfoResponse_QNAME = new QName("http://WSS/", "adminAccountInfoResponse");
    private final static QName _CheckPurchaseHistory_QNAME = new QName("http://WSS/", "checkPurchaseHistory");
    private final static QName _EditAccountInfo_QNAME = new QName("http://WSS/", "editAccountInfo");
    private final static QName _CheckAdminAccount_QNAME = new QName("http://WSS/", "checkAdminAccount");
    private final static QName _DeleteAccount_QNAME = new QName("http://WSS/", "deleteAccount");
    private final static QName _RegisterAccountResponse_QNAME = new QName("http://WSS/", "registerAccountResponse");
    private final static QName _CheckPurchaseHistoryResponse_QNAME = new QName("http://WSS/", "checkPurchaseHistoryResponse");
    private final static QName _MemberLogin_QNAME = new QName("http://WSS/", "memberLogin");
    private final static QName _AdminChangePassword_QNAME = new QName("http://WSS/", "adminChangePassword");
    private final static QName _CheckAdminAccountResponse_QNAME = new QName("http://WSS/", "checkAdminAccountResponse");
    private final static QName _DeletePurchaseHistoryResponse_QNAME = new QName("http://WSS/", "deletePurchaseHistoryResponse");
    private final static QName _MemberList_QNAME = new QName("http://WSS/", "memberList");
    private final static QName _MemberResetPassword_QNAME = new QName("http://WSS/", "memberResetPassword");
    private final static QName _RegisterAccount_QNAME = new QName("http://WSS/", "registerAccount");
    private final static QName _AccountInfoResponse_QNAME = new QName("http://WSS/", "accountInfoResponse");
    private final static QName _MemberResetPasswordResponse_QNAME = new QName("http://WSS/", "memberResetPasswordResponse");
    private final static QName _MemberListResponse_QNAME = new QName("http://WSS/", "memberListResponse");
    private final static QName _MemberChangePasswordResponse_QNAME = new QName("http://WSS/", "memberChangePasswordResponse");
    private final static QName _Testlogin_QNAME = new QName("http://WSS/", "testlogin");
    private final static QName _AdminChangePasswordResponse_QNAME = new QName("http://WSS/", "adminChangePasswordResponse");
    private final static QName _BlockMemberResponse_QNAME = new QName("http://WSS/", "blockMemberResponse");
    private final static QName _DeleteAccountResponse_QNAME = new QName("http://WSS/", "deleteAccountResponse");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://WSS/", "changePasswordResponse");
    private final static QName _EmailActivationCodeResponse_QNAME = new QName("http://WSS/", "emailActivationCodeResponse");
    private final static QName _ActivateAccountResponse_QNAME = new QName("http://WSS/", "activateAccountResponse");
    private final static QName _TestloginResponse_QNAME = new QName("http://WSS/", "testloginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link EmailActivationCodeResponse }
     * 
     */
    public EmailActivationCodeResponse createEmailActivationCodeResponse() {
        return new EmailActivationCodeResponse();
    }

    /**
     * Create an instance of {@link ActivateAccountResponse }
     * 
     */
    public ActivateAccountResponse createActivateAccountResponse() {
        return new ActivateAccountResponse();
    }

    /**
     * Create an instance of {@link TestloginResponse }
     * 
     */
    public TestloginResponse createTestloginResponse() {
        return new TestloginResponse();
    }

    /**
     * Create an instance of {@link MemberListResponse }
     * 
     */
    public MemberListResponse createMemberListResponse() {
        return new MemberListResponse();
    }

    /**
     * Create an instance of {@link MemberChangePasswordResponse }
     * 
     */
    public MemberChangePasswordResponse createMemberChangePasswordResponse() {
        return new MemberChangePasswordResponse();
    }

    /**
     * Create an instance of {@link Testlogin }
     * 
     */
    public Testlogin createTestlogin() {
        return new Testlogin();
    }

    /**
     * Create an instance of {@link AdminChangePasswordResponse }
     * 
     */
    public AdminChangePasswordResponse createAdminChangePasswordResponse() {
        return new AdminChangePasswordResponse();
    }

    /**
     * Create an instance of {@link BlockMemberResponse }
     * 
     */
    public BlockMemberResponse createBlockMemberResponse() {
        return new BlockMemberResponse();
    }

    /**
     * Create an instance of {@link DeletePurchaseHistoryResponse }
     * 
     */
    public DeletePurchaseHistoryResponse createDeletePurchaseHistoryResponse() {
        return new DeletePurchaseHistoryResponse();
    }

    /**
     * Create an instance of {@link MemberList }
     * 
     */
    public MemberList createMemberList() {
        return new MemberList();
    }

    /**
     * Create an instance of {@link MemberResetPassword }
     * 
     */
    public MemberResetPassword createMemberResetPassword() {
        return new MemberResetPassword();
    }

    /**
     * Create an instance of {@link RegisterAccount }
     * 
     */
    public RegisterAccount createRegisterAccount() {
        return new RegisterAccount();
    }

    /**
     * Create an instance of {@link AccountInfoResponse }
     * 
     */
    public AccountInfoResponse createAccountInfoResponse() {
        return new AccountInfoResponse();
    }

    /**
     * Create an instance of {@link MemberResetPasswordResponse }
     * 
     */
    public MemberResetPasswordResponse createMemberResetPasswordResponse() {
        return new MemberResetPasswordResponse();
    }

    /**
     * Create an instance of {@link DeleteAccount }
     * 
     */
    public DeleteAccount createDeleteAccount() {
        return new DeleteAccount();
    }

    /**
     * Create an instance of {@link RegisterAccountResponse }
     * 
     */
    public RegisterAccountResponse createRegisterAccountResponse() {
        return new RegisterAccountResponse();
    }

    /**
     * Create an instance of {@link CheckPurchaseHistoryResponse }
     * 
     */
    public CheckPurchaseHistoryResponse createCheckPurchaseHistoryResponse() {
        return new CheckPurchaseHistoryResponse();
    }

    /**
     * Create an instance of {@link MemberLogin }
     * 
     */
    public MemberLogin createMemberLogin() {
        return new MemberLogin();
    }

    /**
     * Create an instance of {@link AdminChangePassword }
     * 
     */
    public AdminChangePassword createAdminChangePassword() {
        return new AdminChangePassword();
    }

    /**
     * Create an instance of {@link CheckAdminAccountResponse }
     * 
     */
    public CheckAdminAccountResponse createCheckAdminAccountResponse() {
        return new CheckAdminAccountResponse();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link AdminAccountInfoResponse }
     * 
     */
    public AdminAccountInfoResponse createAdminAccountInfoResponse() {
        return new AdminAccountInfoResponse();
    }

    /**
     * Create an instance of {@link CheckPurchaseHistory }
     * 
     */
    public CheckPurchaseHistory createCheckPurchaseHistory() {
        return new CheckPurchaseHistory();
    }

    /**
     * Create an instance of {@link EditAccountInfo }
     * 
     */
    public EditAccountInfo createEditAccountInfo() {
        return new EditAccountInfo();
    }

    /**
     * Create an instance of {@link CheckAdminAccount }
     * 
     */
    public CheckAdminAccount createCheckAdminAccount() {
        return new CheckAdminAccount();
    }

    /**
     * Create an instance of {@link EmailActivationCode }
     * 
     */
    public EmailActivationCode createEmailActivationCode() {
        return new EmailActivationCode();
    }

    /**
     * Create an instance of {@link AdminLoginResponse }
     * 
     */
    public AdminLoginResponse createAdminLoginResponse() {
        return new AdminLoginResponse();
    }

    /**
     * Create an instance of {@link EditAccountInfoResponse }
     * 
     */
    public EditAccountInfoResponse createEditAccountInfoResponse() {
        return new EditAccountInfoResponse();
    }

    /**
     * Create an instance of {@link AdminAccountInfo }
     * 
     */
    public AdminAccountInfo createAdminAccountInfo() {
        return new AdminAccountInfo();
    }

    /**
     * Create an instance of {@link BlockMember }
     * 
     */
    public BlockMember createBlockMember() {
        return new BlockMember();
    }

    /**
     * Create an instance of {@link AdminLogin }
     * 
     */
    public AdminLogin createAdminLogin() {
        return new AdminLogin();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link UnblockMember }
     * 
     */
    public UnblockMember createUnblockMember() {
        return new UnblockMember();
    }

    /**
     * Create an instance of {@link MemberLoginResponse }
     * 
     */
    public MemberLoginResponse createMemberLoginResponse() {
        return new MemberLoginResponse();
    }

    /**
     * Create an instance of {@link CheckAccount }
     * 
     */
    public CheckAccount createCheckAccount() {
        return new CheckAccount();
    }

    /**
     * Create an instance of {@link MemberChangePassword }
     * 
     */
    public MemberChangePassword createMemberChangePassword() {
        return new MemberChangePassword();
    }

    /**
     * Create an instance of {@link UnblockMemberResponse }
     * 
     */
    public UnblockMemberResponse createUnblockMemberResponse() {
        return new UnblockMemberResponse();
    }

    /**
     * Create an instance of {@link DeletePurchaseHistory }
     * 
     */
    public DeletePurchaseHistory createDeletePurchaseHistory() {
        return new DeletePurchaseHistory();
    }

    /**
     * Create an instance of {@link ActivateAccount }
     * 
     */
    public ActivateAccount createActivateAccount() {
        return new ActivateAccount();
    }

    /**
     * Create an instance of {@link CheckAccountResponse }
     * 
     */
    public CheckAccountResponse createCheckAccountResponse() {
        return new CheckAccountResponse();
    }

    /**
     * Create an instance of {@link JsonObject }
     * 
     */
    public JsonObject createJsonObject() {
        return new JsonObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePurchaseHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "deletePurchaseHistory")
    public JAXBElement<DeletePurchaseHistory> createDeletePurchaseHistory(DeletePurchaseHistory value) {
        return new JAXBElement<DeletePurchaseHistory>(_DeletePurchaseHistory_QNAME, DeletePurchaseHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "activateAccount")
    public JAXBElement<ActivateAccount> createActivateAccount(ActivateAccount value) {
        return new JAXBElement<ActivateAccount>(_ActivateAccount_QNAME, ActivateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkAccountResponse")
    public JAXBElement<CheckAccountResponse> createCheckAccountResponse(CheckAccountResponse value) {
        return new JAXBElement<CheckAccountResponse>(_CheckAccountResponse_QNAME, CheckAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberLoginResponse")
    public JAXBElement<MemberLoginResponse> createMemberLoginResponse(MemberLoginResponse value) {
        return new JAXBElement<MemberLoginResponse>(_MemberLoginResponse_QNAME, MemberLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkAccount")
    public JAXBElement<CheckAccount> createCheckAccount(CheckAccount value) {
        return new JAXBElement<CheckAccount>(_CheckAccount_QNAME, CheckAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberChangePassword")
    public JAXBElement<MemberChangePassword> createMemberChangePassword(MemberChangePassword value) {
        return new JAXBElement<MemberChangePassword>(_MemberChangePassword_QNAME, MemberChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnblockMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "unblockMemberResponse")
    public JAXBElement<UnblockMemberResponse> createUnblockMemberResponse(UnblockMemberResponse value) {
        return new JAXBElement<UnblockMemberResponse>(_UnblockMemberResponse_QNAME, UnblockMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailActivationCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "emailActivationCode")
    public JAXBElement<EmailActivationCode> createEmailActivationCode(EmailActivationCode value) {
        return new JAXBElement<EmailActivationCode>(_EmailActivationCode_QNAME, EmailActivationCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "adminLoginResponse")
    public JAXBElement<AdminLoginResponse> createAdminLoginResponse(AdminLoginResponse value) {
        return new JAXBElement<AdminLoginResponse>(_AdminLoginResponse_QNAME, AdminLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAccountInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "editAccountInfoResponse")
    public JAXBElement<EditAccountInfoResponse> createEditAccountInfoResponse(EditAccountInfoResponse value) {
        return new JAXBElement<EditAccountInfoResponse>(_EditAccountInfoResponse_QNAME, EditAccountInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "adminAccountInfo")
    public JAXBElement<AdminAccountInfo> createAdminAccountInfo(AdminAccountInfo value) {
        return new JAXBElement<AdminAccountInfo>(_AdminAccountInfo_QNAME, AdminAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "blockMember")
    public JAXBElement<BlockMember> createBlockMember(BlockMember value) {
        return new JAXBElement<BlockMember>(_BlockMember_QNAME, BlockMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "adminLogin")
    public JAXBElement<AdminLogin> createAdminLogin(AdminLogin value) {
        return new JAXBElement<AdminLogin>(_AdminLogin_QNAME, AdminLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnblockMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "unblockMember")
    public JAXBElement<UnblockMember> createUnblockMember(UnblockMember value) {
        return new JAXBElement<UnblockMember>(_UnblockMember_QNAME, UnblockMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "accountInfo")
    public JAXBElement<AccountInfo> createAccountInfo(AccountInfo value) {
        return new JAXBElement<AccountInfo>(_AccountInfo_QNAME, AccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminAccountInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "adminAccountInfoResponse")
    public JAXBElement<AdminAccountInfoResponse> createAdminAccountInfoResponse(AdminAccountInfoResponse value) {
        return new JAXBElement<AdminAccountInfoResponse>(_AdminAccountInfoResponse_QNAME, AdminAccountInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPurchaseHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkPurchaseHistory")
    public JAXBElement<CheckPurchaseHistory> createCheckPurchaseHistory(CheckPurchaseHistory value) {
        return new JAXBElement<CheckPurchaseHistory>(_CheckPurchaseHistory_QNAME, CheckPurchaseHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "editAccountInfo")
    public JAXBElement<EditAccountInfo> createEditAccountInfo(EditAccountInfo value) {
        return new JAXBElement<EditAccountInfo>(_EditAccountInfo_QNAME, EditAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAdminAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkAdminAccount")
    public JAXBElement<CheckAdminAccount> createCheckAdminAccount(CheckAdminAccount value) {
        return new JAXBElement<CheckAdminAccount>(_CheckAdminAccount_QNAME, CheckAdminAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "deleteAccount")
    public JAXBElement<DeleteAccount> createDeleteAccount(DeleteAccount value) {
        return new JAXBElement<DeleteAccount>(_DeleteAccount_QNAME, DeleteAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "registerAccountResponse")
    public JAXBElement<RegisterAccountResponse> createRegisterAccountResponse(RegisterAccountResponse value) {
        return new JAXBElement<RegisterAccountResponse>(_RegisterAccountResponse_QNAME, RegisterAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPurchaseHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkPurchaseHistoryResponse")
    public JAXBElement<CheckPurchaseHistoryResponse> createCheckPurchaseHistoryResponse(CheckPurchaseHistoryResponse value) {
        return new JAXBElement<CheckPurchaseHistoryResponse>(_CheckPurchaseHistoryResponse_QNAME, CheckPurchaseHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberLogin")
    public JAXBElement<MemberLogin> createMemberLogin(MemberLogin value) {
        return new JAXBElement<MemberLogin>(_MemberLogin_QNAME, MemberLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "adminChangePassword")
    public JAXBElement<AdminChangePassword> createAdminChangePassword(AdminChangePassword value) {
        return new JAXBElement<AdminChangePassword>(_AdminChangePassword_QNAME, AdminChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAdminAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkAdminAccountResponse")
    public JAXBElement<CheckAdminAccountResponse> createCheckAdminAccountResponse(CheckAdminAccountResponse value) {
        return new JAXBElement<CheckAdminAccountResponse>(_CheckAdminAccountResponse_QNAME, CheckAdminAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePurchaseHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "deletePurchaseHistoryResponse")
    public JAXBElement<DeletePurchaseHistoryResponse> createDeletePurchaseHistoryResponse(DeletePurchaseHistoryResponse value) {
        return new JAXBElement<DeletePurchaseHistoryResponse>(_DeletePurchaseHistoryResponse_QNAME, DeletePurchaseHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberList")
    public JAXBElement<MemberList> createMemberList(MemberList value) {
        return new JAXBElement<MemberList>(_MemberList_QNAME, MemberList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberResetPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberResetPassword")
    public JAXBElement<MemberResetPassword> createMemberResetPassword(MemberResetPassword value) {
        return new JAXBElement<MemberResetPassword>(_MemberResetPassword_QNAME, MemberResetPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "registerAccount")
    public JAXBElement<RegisterAccount> createRegisterAccount(RegisterAccount value) {
        return new JAXBElement<RegisterAccount>(_RegisterAccount_QNAME, RegisterAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "accountInfoResponse")
    public JAXBElement<AccountInfoResponse> createAccountInfoResponse(AccountInfoResponse value) {
        return new JAXBElement<AccountInfoResponse>(_AccountInfoResponse_QNAME, AccountInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberResetPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberResetPasswordResponse")
    public JAXBElement<MemberResetPasswordResponse> createMemberResetPasswordResponse(MemberResetPasswordResponse value) {
        return new JAXBElement<MemberResetPasswordResponse>(_MemberResetPasswordResponse_QNAME, MemberResetPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberListResponse")
    public JAXBElement<MemberListResponse> createMemberListResponse(MemberListResponse value) {
        return new JAXBElement<MemberListResponse>(_MemberListResponse_QNAME, MemberListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "memberChangePasswordResponse")
    public JAXBElement<MemberChangePasswordResponse> createMemberChangePasswordResponse(MemberChangePasswordResponse value) {
        return new JAXBElement<MemberChangePasswordResponse>(_MemberChangePasswordResponse_QNAME, MemberChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Testlogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "testlogin")
    public JAXBElement<Testlogin> createTestlogin(Testlogin value) {
        return new JAXBElement<Testlogin>(_Testlogin_QNAME, Testlogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "adminChangePasswordResponse")
    public JAXBElement<AdminChangePasswordResponse> createAdminChangePasswordResponse(AdminChangePasswordResponse value) {
        return new JAXBElement<AdminChangePasswordResponse>(_AdminChangePasswordResponse_QNAME, AdminChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "blockMemberResponse")
    public JAXBElement<BlockMemberResponse> createBlockMemberResponse(BlockMemberResponse value) {
        return new JAXBElement<BlockMemberResponse>(_BlockMemberResponse_QNAME, BlockMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "deleteAccountResponse")
    public JAXBElement<DeleteAccountResponse> createDeleteAccountResponse(DeleteAccountResponse value) {
        return new JAXBElement<DeleteAccountResponse>(_DeleteAccountResponse_QNAME, DeleteAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailActivationCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "emailActivationCodeResponse")
    public JAXBElement<EmailActivationCodeResponse> createEmailActivationCodeResponse(EmailActivationCodeResponse value) {
        return new JAXBElement<EmailActivationCodeResponse>(_EmailActivationCodeResponse_QNAME, EmailActivationCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "activateAccountResponse")
    public JAXBElement<ActivateAccountResponse> createActivateAccountResponse(ActivateAccountResponse value) {
        return new JAXBElement<ActivateAccountResponse>(_ActivateAccountResponse_QNAME, ActivateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestloginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "testloginResponse")
    public JAXBElement<TestloginResponse> createTestloginResponse(TestloginResponse value) {
        return new JAXBElement<TestloginResponse>(_TestloginResponse_QNAME, TestloginResponse.class, null, value);
    }

}
