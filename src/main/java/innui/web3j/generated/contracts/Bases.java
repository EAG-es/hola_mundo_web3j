package innui.web3j.generated.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class Bases extends Contract {
    public static final String BINARY = "60806040526001805460ff1916811790553480156200001d57600080fd5b5060408051608081018252606060208083018281526000848601908152838501939093523384528451808601865260048152631c9bdbdd60e21b8184015290526f726f6f745f686f6c615f6d756e646f7360801b9091528251600180825281850190945291929082810190803683375050506060820181905280516d7065726d69736f5f6d6178696d6f60901b9190600090620000be57620000be62000207565b60209081029190910181019190915260008054600181018255908052825160049091027f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563810180546001600160a01b039093166001600160a01b03199093169290921782559183015183927f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e5640190620001589082620002ac565b506040820151600282015560608201518051620001809160038401916020909101906200018a565b5050505062000378565b828054828255906000526020600020908101928215620001c8579160200282015b82811115620001c8578251825591602001919060010190620001ab565b50620001d6929150620001da565b5090565b5b80821115620001d65760008155600101620001db565b634e487b7160e01b600052604160045260246000fd5b634e487b7160e01b600052603260045260246000fd5b600181811c908216806200023257607f821691505b6020821081036200025357634e487b7160e01b600052602260045260246000fd5b50919050565b601f821115620002a757600081815260208120601f850160051c81016020861015620002825750805b601f850160051c820191505b81811015620002a3578281556001016200028e565b5050505b505050565b81516001600160401b03811115620002c857620002c8620001f1565b620002e081620002d984546200021d565b8462000259565b602080601f831160018114620003185760008415620002ff5750858301515b600019600386901b1c1916600185901b178555620002a3565b600085815260208120601f198616915b82811015620003495788860151825594840194600190910190840162000328565b5085821015620003685787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b611aea80620003886000396000f3fe608060405234801561001057600080fd5b50600436106100f55760003560e01c806379ad29d711610097578063db38f49911610066578063db38f499146101e5578063e9581083146101f8578063f653ea1314610218578063f9d06c4d1461022b57600080fd5b806379ad29d7146101a05780638e3ee7ba146101b3578063b776a7a2146101d5578063c49c3d05146101dd57600080fd5b80632dd47cac116100d35780632dd47cac146101485780634ac771e7146101505780634dc4643714610163578063688e34671461018657600080fd5b806309146d91146100fa5780630beef3241461010f5780631d032d0114610122575b600080fd5b61010d61010836600461126f565b61023e565b005b61010d61011d36600461131b565b610459565b6101356101303660046113b4565b610667565b6040519081526020015b60405180910390f35b61010d6106e0565b61010d61015e3660046113d6565b61071d565b6101766101713660046113b4565b61092b565b604051901515815260200161013f565b6001546101939060ff1681565b60405161013f9190611424565b6101766101ae36600461144c565b610993565b6101c66101c1366004611476565b610a48565b60405161013f939291906114df565b61010d610b10565b61010d610b47565b61010d6101f3366004611513565b610b80565b61020b610206366004611476565b610c53565b60405161013f9190611550565b610176610226366004611594565b610d2b565b61010d6102393660046113b4565b610dd9565b336102488161092b565b61026d5760405162461bcd60e51b8152600401610264906115e2565b60405180910390fd5b8151600061027a82610667565b9050600081121561029d5760405162461bcd60e51b815260040161026490611619565b60005b846060015151811015610391576d7065726d69736f5f6d6178696d6f60901b856060015182815181106102d5576102d5611649565b60200260200101510361037f576102fd336d7065726d69736f5f6d6178696d6f60901b610993565b61037a5760405162461bcd60e51b815260206004820152604260248201527f4e6f20707565646520706f6e657220656c207065726d69736f206dc3a178696d60448201527f6f3b20736920717569656e206c6f20706964652c206e6f206c6f20706f736565606482015261017160f51b608482015260a401610264565b610391565b61038a816001611675565b90506102a0565b8460600151600082815481106103a9576103a9611649565b906000526020600020906004020160030190805190602001906103cd929190610fee565b508460200151600082815481106103e6576103e6611649565b906000526020600020906004020160010190816104039190611711565b5061041f336d7065726d69736f5f6d6178696d6f60901b610993565b156104525784604001516000828154811061043c5761043c611649565b9060005260206000209060040201600201819055505b5050505050565b336104638161092b565b61047f5760405162461bcd60e51b8152600401610264906115e2565b6000805b6000548110156104df57600081815481106104a0576104a0611649565b60009182526020909120600490910201546001600160a01b03908116908816036104cd57600191506104df565b6104d8816001611675565b9050610483565b81156105265760405162461bcd60e51b8152602060048201526016602482015275022b6103ab9bab0b934b7903cb09032bc34b9ba3297160551b6044820152606401610264565b604080516080810182526000818301526060808201526001600160a01b038916815260208101889052905160029061055f9088906117d1565b602060405180830381855afa15801561057c573d6000803e3d6000fd5b5050506040513d601f19601f8201168201806040525081019061059f91906117ed565b6040820152606081018590526000805460018101825590805281517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563600490920291820180546001600160a01b0319166001600160a01b03909216919091178155602083015183927f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56401906106349082611711565b50604082015160028201556060820151805161065a916003840191602090910190610fee565b5050505050505050505050565b600080805b6000548110156106c8576000818154811061068957610689611649565b60009182526020909120600490910201546001600160a01b03908116908516036106b657600191506106c8565b6106c1816001611675565b905061066c565b81156106d5579392505050565b506000199392505050565b336106ea8161092b565b6107065760405162461bcd60e51b8152600401610264906115e2565b600180546000919060ff191681835b021790555050565b60405163fc09a9e560e01b81526d7065726d69736f5f6d6178696d6f60901b6004820181905290339060009073__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__9063fc09a9e590602401600060405180830381865af4158015610785573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f191682016040526107ad9190810190611806565b90506107b98284610993565b816040516020016107ca919061187d565b604051602081830303815290604052906107f75760405162461bcd60e51b815260040161026491906118e8565b506000805b6000548110156108c35773__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__6376332c2d886000848154811061083457610834611649565b90600052602060002090600402016001016040518363ffffffff1660e01b81526004016108629291906118fb565b602060405180830381865af415801561087f573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906108a39190611996565b156108b157600191506108c3565b6108bc816001611675565b90506107fc565b816108e05760405162461bcd60e51b815260040161026490611619565b85600082815481106108f4576108f4611649565b6000918252602090912060049091020180546001600160a01b0319166001600160a01b039290921691909117905550505050505050565b600080805b60005481101561098c576000818154811061094d5761094d611649565b60009182526020909120600490910201546001600160a01b039081169085160361097a576001915061098c565b610985816001611675565b9050610930565b5092915050565b600080806109a085610667565b9050600080808312610a3b575081905060005b600082815481106109c6576109c6611649565b906000526020600020906004020160030180549050811015610a3b5785600083815481106109f6576109f6611649565b90600052602060002090600402016003018281548110610a1857610a18611649565b90600052602060002001540315610a3b57610a34816001611675565b90506109b3565b5091925050505b92915050565b60008181548110610a5857600080fd5b6000918252602090912060049091020180546001820180546001600160a01b03909216935090610a8790611688565b80601f0160208091040260200160405190810160405280929190818152602001828054610ab390611688565b8015610b005780601f10610ad557610100808354040283529160200191610b00565b820191906000526020600020905b815481529060010190602001808311610ae357829003601f168201915b5050505050908060020154905083565b33610b1a8161092b565b610b365760405162461bcd60e51b8152600401610264906115e2565b60018054819060ff19168180610715565b33610b518161092b565b610b6d5760405162461bcd60e51b8152600401610264906115e2565b600180546002919060ff19168183610715565b33610b8a8161092b565b610ba65760405162461bcd60e51b8152600401610264906115e2565b336000610bb282610667565b90506000811215610bd55760405162461bcd60e51b815260040161026490611619565b600284604051610be591906117d1565b602060405180830381855afa158015610c02573d6000803e3d6000fd5b5050506040513d601f19601f82011682018060405250810190610c2591906117ed565b60008281548110610c3857610c38611649565b90600052602060002090600402016002018190555050505050565b60606000821215610cb15760405162461bcd60e51b815260206004820152602260248201527f4c6120706f73696369c3b36e206e6f20707565646520736572206e6567617469604482015261766160f01b6064820152608401610264565b60008281548110610cc457610cc4611649565b9060005260206000209060040201600301805480602002602001604051908101604052809291908181526020018280548015610d1f57602002820191906000526020600020905b815481526020019060010190808311610d0b575b50505050509050919050565b600080610d3784610667565b90506000811215610d5a5760405162461bcd60e51b815260040161026490611619565b600283604051610d6a91906117d1565b602060405180830381855afa158015610d87573d6000803e3d6000fd5b5050506040513d601f19601f82011682018060405250810190610daa91906117ed565b60008281548110610dbd57610dbd611649565b9060005260206000209060040201600201541491505092915050565b60405163fc09a9e560e01b81526d7065726d69736f5f6d6178696d6f60901b6004820181905290339060009073__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__9063fc09a9e590602401600060405180830381865af4158015610e41573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f19168201604052610e699190810190611806565b9050610e758284610993565b81604051602001610e86919061187d565b60405160208183030381529060405290610eb35760405162461bcd60e51b815260040161026491906118e8565b506000610ebf85610667565b90506000811215610ee25760405162461bcd60e51b815260040161026490611619565b60008054610ef2906001906119b8565b81548110610f0257610f02611649565b906000526020600020906004020160008281548110610f2357610f23611649565b60009182526020909120825460049092020180546001600160a01b0319166001600160a01b03909216919091178155600180820190610f64908401826119cb565b50600282015481600201556003820181600301908054610f85929190611039565b509050506000805480610f9a57610f9a611a9e565b60008281526020812060046000199093019283020180546001600160a01b031916815590610fcb6001830182611079565b6002820160009055600382016000610fe391906110b6565b505090555050505050565b828054828255906000526020600020908101928215611029579160200282015b8281111561102957825182559160200191906001019061100e565b506110359291506110d0565b5090565b8280548282559060005260206000209081019282156110295760005260206000209182015b8281111561102957825482559160010191906001019061105e565b50805461108590611688565b6000825580601f10611095575050565b601f0160209004906000526020600020908101906110b391906110d0565b50565b50805460008255906000526020600020908101906110b391905b5b8082111561103557600081556001016110d1565b634e487b7160e01b600052604160045260246000fd5b6040516080810167ffffffffffffffff8111828210171561111e5761111e6110e5565b60405290565b604051601f8201601f1916810167ffffffffffffffff8111828210171561114d5761114d6110e5565b604052919050565b80356001600160a01b038116811461116c57600080fd5b919050565b600067ffffffffffffffff82111561118b5761118b6110e5565b50601f01601f191660200190565b600082601f8301126111aa57600080fd5b81356111bd6111b882611171565b611124565b8181528460208386010111156111d257600080fd5b816020850160208301376000918101602001919091529392505050565b600082601f83011261120057600080fd5b8135602067ffffffffffffffff82111561121c5761121c6110e5565b8160051b61122b828201611124565b928352848101820192828101908785111561124557600080fd5b83870192505b848310156112645782358252918301919083019061124b565b979650505050505050565b60006020828403121561128157600080fd5b813567ffffffffffffffff8082111561129957600080fd5b90830190608082860312156112ad57600080fd5b6112b56110fb565b6112be83611155565b81526020830135828111156112d257600080fd5b6112de87828601611199565b6020830152506040830135604082015260608301358281111561130057600080fd5b61130c878286016111ef565b60608301525095945050505050565b6000806000806080858703121561133157600080fd5b61133a85611155565b9350602085013567ffffffffffffffff8082111561135757600080fd5b61136388838901611199565b9450604087013591508082111561137957600080fd5b61138588838901611199565b9350606087013591508082111561139b57600080fd5b506113a8878288016111ef565b91505092959194509250565b6000602082840312156113c657600080fd5b6113cf82611155565b9392505050565b600080604083850312156113e957600080fd5b823567ffffffffffffffff81111561140057600080fd5b61140c85828601611199565b92505061141b60208401611155565b90509250929050565b602081016003831061144657634e487b7160e01b600052602160045260246000fd5b91905290565b6000806040838503121561145f57600080fd5b61146883611155565b946020939093013593505050565b60006020828403121561148857600080fd5b5035919050565b60005b838110156114aa578181015183820152602001611492565b50506000910152565b600081518084526114cb81602086016020860161148f565b601f01601f19169290920160200192915050565b6001600160a01b0384168152606060208201819052600090611503908301856114b3565b9050826040830152949350505050565b60006020828403121561152557600080fd5b813567ffffffffffffffff81111561153c57600080fd5b61154884828501611199565b949350505050565b6020808252825182820181905260009190848201906040850190845b818110156115885783518352928401929184019160010161156c565b50909695505050505050565b600080604083850312156115a757600080fd5b6115b083611155565b9150602083013567ffffffffffffffff8111156115cc57600080fd5b6115d885828601611199565b9150509250929050565b60208082526019908201527f5573756172696f206e6f2061646d696e6973747261646f722e00000000000000604082015260600190565b602080825260169082015275022b6103ab9bab0b934b79037379032bc34b9ba3297160551b604082015260600190565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b80820180821115610a4257610a4261165f565b600181811c9082168061169c57607f821691505b6020821081036116bc57634e487b7160e01b600052602260045260246000fd5b50919050565b601f82111561170c57600081815260208120601f850160051c810160208610156116e95750805b601f850160051c820191505b81811015611708578281556001016116f5565b5050505b505050565b815167ffffffffffffffff81111561172b5761172b6110e5565b61173f816117398454611688565b846116c2565b602080601f831160018114611774576000841561175c5750858301515b600019600386901b1c1916600185901b178555611708565b600085815260208120601f198616915b828110156117a357888601518255948401946001909101908401611784565b50858210156117c15787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b600082516117e381846020870161148f565b9190910192915050565b6000602082840312156117ff57600080fd5b5051919050565b60006020828403121561181857600080fd5b815167ffffffffffffffff81111561182f57600080fd5b8201601f8101841361184057600080fd5b805161184e6111b882611171565b81815285602083850101111561186357600080fd5b61187482602083016020860161148f565b95945050505050565b7f5573756172696f206e6f2061646d696e6973747261646f72206f206e6f20746981527f656e6520656c207065726d69736f20736f6c6963697461646f3a2000000000006020820152600082516118db81603b85016020870161148f565b91909101603b0192915050565b6020815260006113cf60208301846114b3565b60408152600061190e60408301856114b3565b6020838203818501526000855461192481611688565b8085526001828116801561193f576001811461195957611987565b60ff1984168787015282151560051b870186019450611987565b896000528560002060005b8481101561197f578154898201890152908301908701611964565b880187019550505b50929998505050505050505050565b6000602082840312156119a857600080fd5b815180151581146113cf57600080fd5b81810381811115610a4257610a4261165f565b8181036119d6575050565b6119e08254611688565b67ffffffffffffffff8111156119f8576119f86110e5565b611a06816117398454611688565b6000601f821160018114611a3a5760008315611a225750848201545b600019600385901b1c1916600184901b178455610452565b600085815260209020601f19841690600086815260209020845b83811015611a745782860154825560019586019590910190602001611a54565b50858310156117c15793015460001960f8600387901b161c19169092555050600190811b01905550565b634e487b7160e01b600052603160045260246000fdfea26469706673582212203998510653832d30ed97300eab3c025c70f8f9f8fb8a503d0dd8017ef71e5e0764736f6c63430008110033";

    public static final String FUNC_ACL_ARRAY = "acl_array";

    public static final String FUNC_ACTIVAR = "activar";

    public static final String FUNC_ACTUALIZAR_ADMINISTRADOR = "actualizar_administrador";

    public static final String FUNC_ACTUALIZAR_ADMINISTRADOR_CLAVE = "actualizar_administrador_clave";

    public static final String FUNC_BORRAR_ADMINISTRADOR = "borrar_administrador";

    public static final String FUNC_CAMBIAR_DIRECCION = "cambiar_direccion";

    public static final String FUNC_COMPROBAR_CLAVE = "comprobar_clave";

    public static final String FUNC_CREAR_ADMINISTRADOR = "crear_administrador";

    public static final String FUNC_ESTADO = "estado";

    public static final String FUNC_INACTIVAR = "inactivar";

    public static final String FUNC_LEER_ADMINISTRADOR_PERMISOS_ARRAY = "leer_administrador_permisos_array";

    public static final String FUNC_LEER_ADMINISTRADOR_POS = "leer_administrador_pos";

    public static final String FUNC_LIMITAR = "limitar";

    public static final String FUNC_SER_ADMINISTRADOR = "ser_administrador";

    public static final String FUNC_SER_ADMINISTRADOR_CON_PERMISO = "ser_administrador_con_permiso";

    @Deprecated
    protected Bases(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Bases(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Bases(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Bases(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Tuple3<String, String, byte[]>> acl_array(BigInteger param0) {
        final Function function = new Function(FUNC_ACL_ARRAY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Bytes32>() {}));
        return new RemoteFunctionCall<Tuple3<String, String, byte[]>>(function,
                new Callable<Tuple3<String, String, byte[]>>() {
                    @Override
                    public Tuple3<String, String, byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, String, byte[]>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (byte[]) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> activar() {
        final Function function = new Function(
                FUNC_ACTIVAR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> actualizar_administrador(acls acl) {
        final Function function = new Function(
                FUNC_ACTUALIZAR_ADMINISTRADOR, 
                Arrays.<Type>asList(acl), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> actualizar_administrador_clave(byte[] clave) {
        final Function function = new Function(
                FUNC_ACTUALIZAR_ADMINISTRADOR_CLAVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(clave)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> borrar_administrador(String direccion) {
        final Function function = new Function(
                FUNC_BORRAR_ADMINISTRADOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, direccion)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> cambiar_direccion(String usuario, String nueva_direccion) {
        final Function function = new Function(
                FUNC_CAMBIAR_DIRECCION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(usuario), 
                new org.web3j.abi.datatypes.Address(160, nueva_direccion)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> comprobar_clave(String direccion, byte[] clave) {
        final Function function = new Function(FUNC_COMPROBAR_CLAVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, direccion), 
                new org.web3j.abi.datatypes.DynamicBytes(clave)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> crear_administrador(String direccion, String usuario, byte[] clave, List<byte[]> permisos_array) {
        final Function function = new Function(
                FUNC_CREAR_ADMINISTRADOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, direccion), 
                new org.web3j.abi.datatypes.Utf8String(usuario), 
                new org.web3j.abi.datatypes.DynamicBytes(clave), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(permisos_array, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> estado() {
        final Function function = new Function(FUNC_ESTADO, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> inactivar() {
        final Function function = new Function(
                FUNC_INACTIVAR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<List> leer_administrador_permisos_array(BigInteger pos) {
        final Function function = new Function(FUNC_LEER_ADMINISTRADOR_PERMISOS_ARRAY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int256(pos)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Bytes32>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> leer_administrador_pos(String direccion) {
        final Function function = new Function(FUNC_LEER_ADMINISTRADOR_POS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, direccion)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> limitar() {
        final Function function = new Function(
                FUNC_LIMITAR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> ser_administrador(String direccion) {
        final Function function = new Function(FUNC_SER_ADMINISTRADOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, direccion)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Boolean> ser_administrador_con_permiso(String direccion, byte[] permiso_necesario) {
        final Function function = new Function(FUNC_SER_ADMINISTRADOR_CON_PERMISO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, direccion), 
                new org.web3j.abi.datatypes.generated.Bytes32(permiso_necesario)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static Bases load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Bases(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Bases load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Bases(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Bases load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Bases(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Bases load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Bases(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Bases> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Bases.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Bases> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Bases.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Bases> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Bases.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Bases> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Bases.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class acls extends DynamicStruct {
        public String direccion;

        public String usuario;

        public byte[] clave;

        public List<byte[]> permisos_array;

        public acls(String direccion, String usuario, byte[] clave, List<byte[]> permisos_array) {
            super(new org.web3j.abi.datatypes.Address(160, direccion), 
                    new org.web3j.abi.datatypes.Utf8String(usuario), 
                    new org.web3j.abi.datatypes.generated.Bytes32(clave), 
                    new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                            org.web3j.abi.datatypes.generated.Bytes32.class,
                            org.web3j.abi.Utils.typeMap(permisos_array, org.web3j.abi.datatypes.generated.Bytes32.class)));
            this.direccion = direccion;
            this.usuario = usuario;
            this.clave = clave;
            this.permisos_array = permisos_array;
        }

        public acls(Address direccion, Utf8String usuario, Bytes32 clave, DynamicArray<Bytes32> permisos_array) {
            super(direccion, usuario, clave, permisos_array);
            this.direccion = direccion.getValue();
            this.usuario = usuario.getValue();
            this.clave = clave.getValue();
            this.permisos_array = permisos_array.getValue().stream().map(v -> v.getValue()).collect(Collectors.toList());
        }
    }
}
