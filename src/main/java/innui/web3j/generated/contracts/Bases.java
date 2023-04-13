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
    public static final String BINARY = "60806040526001805460ff1916811790553480156200001d57600080fd5b5060408051608081018252606060208083018281526000848601908152838501939093523384528451808601865260048152631c9bdbdd60e21b8184015290526f726f6f745f686f6c615f6d756e646f7360801b9091528251600180825281850190945291929082810190803683375050506060820181905280516d7065726d69736f5f6d6178696d6f60901b9190600090620000be57620000be62000207565b60209081029190910181019190915260008054600181018255908052825160049091027f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563810180546001600160a01b039093166001600160a01b03199093169290921782559183015183927f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e5640190620001589082620002ac565b506040820151600282015560608201518051620001809160038401916020909101906200018a565b5050505062000378565b828054828255906000526020600020908101928215620001c8579160200282015b82811115620001c8578251825591602001919060010190620001ab565b50620001d6929150620001da565b5090565b5b80821115620001d65760008155600101620001db565b634e487b7160e01b600052604160045260246000fd5b634e487b7160e01b600052603260045260246000fd5b600181811c908216806200023257607f821691505b6020821081036200025357634e487b7160e01b600052602260045260246000fd5b50919050565b601f821115620002a757600081815260208120601f850160051c81016020861015620002825750805b601f850160051c820191505b81811015620002a3578281556001016200028e565b5050505b505050565b81516001600160401b03811115620002c857620002c8620001f1565b620002e081620002d984546200021d565b8462000259565b602080601f831160018114620003185760008415620002ff5750858301515b600019600386901b1c1916600185901b178555620002a3565b600085815260208120601f198616915b82811015620003495788860151825594840194600190910190840162000328565b5085821015620003685787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b611bcf80620003886000396000f3fe608060405234801561001057600080fd5b50600436106100f55760003560e01c806379ad29d711610097578063c49c3d0511610066578063c49c3d05146101fd578063db38f49914610205578063f653ea1314610218578063f9d06c4d1461022b57600080fd5b806379ad29d7146101ad5780637e9f13cb146101c05780638e3ee7ba146101d3578063b776a7a2146101f557600080fd5b8063311b5091116100d3578063311b50911461013d5780634ac771e71461015d5780634dc4643714610170578063688e34671461019357600080fd5b80630beef324146100fa5780631d032d011461010f5780632dd47cac14610135575b600080fd5b61010d61010836600461130b565b61023e565b005b61012261011d3660046113a4565b610455565b6040519081526020015b60405180910390f35b61010d6104ce565b61015061014b3660046113a4565b61050b565b60405161012c9190611416565b61010d61016b36600461149f565b6106cd565b61018361017e3660046113a4565b6108db565b604051901515815260200161012c565b6001546101a09060ff1681565b60405161012c91906114ed565b6101836101bb366004611515565b610943565b61010d6101ce36600461153f565b6109f8565b6101e66101e13660046115eb565b610bbc565b60405161012c93929190611604565b61010d610c84565b61010d610cbb565b61010d610213366004611638565b610cf4565b610183610226366004611675565b610dc7565b61010d6102393660046113a4565b610e75565b33610248816108db565b61026d5760405162461bcd60e51b8152600401610264906116c3565b60405180910390fd5b6000805b6000548110156102cd576000818154811061028e5761028e6116fa565b60009182526020909120600490910201546001600160a01b03908116908816036102bb57600191506102cd565b6102c6816001611726565b9050610271565b81156103145760405162461bcd60e51b8152602060048201526016602482015275022b6103ab9bab0b934b7903cb09032bc34b9ba3297160551b6044820152606401610264565b604080516080810182526000818301526060808201526001600160a01b038916815260208101889052905160029061034d908890611739565b602060405180830381855afa15801561036a573d6000803e3d6000fd5b5050506040513d601f19601f8201168201806040525081019061038d9190611755565b6040820152606081018590526000805460018101825590805281517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563600490920291820180546001600160a01b0319166001600160a01b03909216919091178155602083015183927f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e564019061042290826117f3565b50604082015160028201556060820151805161044891600384019160209091019061108a565b5050505050505050505050565b600080805b6000548110156104b65760008181548110610477576104776116fa565b60009182526020909120600490910201546001600160a01b03908116908516036104a457600191506104b6565b6104af816001611726565b905061045a565b81156104c3579392505050565b506000199392505050565b336104d8816108db565b6104f45760405162461bcd60e51b8152600401610264906116c3565b600180546000919060ff191681835b021790555050565b6040805160808101825260008082526060602083018190529282015281810191909152600061053983610455565b9050600081121561055c5760405162461bcd60e51b8152600401610264906118b3565b604080516080810182526000808252606060208301819052928201528181019190915260008281548110610592576105926116fa565b6000918252602091829020604080516080810190915260049092020180546001600160a01b0316825260018101805492939192918401916105d29061176e565b80601f01602080910402602001604051908101604052809291908181526020018280546105fe9061176e565b801561064b5780601f106106205761010080835404028352916020019161064b565b820191906000526020600020905b81548152906001019060200180831161062e57829003601f168201915b5050505050815260200160028201548152602001600382018054806020026020016040519081016040528092919081815260200182805480156106ad57602002820191906000526020600020905b815481526020019060010190808311610699575b50505091909252505064151515151560d91b604083015250949350505050565b60405163fc09a9e560e01b81526d7065726d69736f5f6d6178696d6f60901b6004820181905290339060009073__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__9063fc09a9e590602401600060405180830381865af4158015610735573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f1916820160405261075d91908101906118e3565b90506107698284610943565b8160405160200161077a919061195a565b604051602081830303815290604052906107a75760405162461bcd60e51b815260040161026491906119c5565b506000805b6000548110156108735773__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__6376332c2d88600084815481106107e4576107e46116fa565b90600052602060002090600402016001016040518363ffffffff1660e01b81526004016108129291906119d8565b602060405180830381865af415801561082f573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906108539190611a73565b156108615760019150610873565b61086c816001611726565b90506107ac565b816108905760405162461bcd60e51b8152600401610264906118b3565b85600082815481106108a4576108a46116fa565b6000918252602090912060049091020180546001600160a01b0319166001600160a01b039290921691909117905550505050505050565b600080805b60005481101561093c57600081815481106108fd576108fd6116fa565b60009182526020909120600490910201546001600160a01b039081169085160361092a576001915061093c565b610935816001611726565b90506108e0565b5092915050565b6000808061095085610455565b90506000808083126109eb575081905060005b60008281548110610976576109766116fa565b9060005260206000209060040201600301805490508110156109eb5785600083815481106109a6576109a66116fa565b906000526020600020906004020160030182815481106109c8576109c86116fa565b906000526020600020015403156109eb576109e4816001611726565b9050610963565b5091925050505b92915050565b33610a02816108db565b610a1e5760405162461bcd60e51b8152600401610264906116c3565b81516000610a2b82610455565b90506000811215610a4e5760405162461bcd60e51b8152600401610264906118b3565b60005b846060015151811015610b42576d7065726d69736f5f6d6178696d6f60901b85606001518281518110610a8657610a866116fa565b602002602001015103610b3057610aae336d7065726d69736f5f6d6178696d6f60901b610943565b610b2b5760405162461bcd60e51b815260206004820152604260248201527f4e6f20707565646520706f6e657220656c207065726d69736f206dc3a178696d60448201527f6f3b20736920717569656e206c6f20706964652c206e6f206c6f20706f736565606482015261017160f51b608482015260a401610264565b610b42565b610b3b816001611726565b9050610a51565b846060015160008281548110610b5a57610b5a6116fa565b90600052602060002090600402016003019080519060200190610b7e92919061108a565b50846020015160008281548110610b9757610b976116fa565b90600052602060002090600402016001019081610bb491906117f3565b505050505050565b60008181548110610bcc57600080fd5b6000918252602090912060049091020180546001820180546001600160a01b03909216935090610bfb9061176e565b80601f0160208091040260200160405190810160405280929190818152602001828054610c279061176e565b8015610c745780601f10610c4957610100808354040283529160200191610c74565b820191906000526020600020905b815481529060010190602001808311610c5757829003601f168201915b5050505050908060020154905083565b33610c8e816108db565b610caa5760405162461bcd60e51b8152600401610264906116c3565b60018054819060ff19168180610503565b33610cc5816108db565b610ce15760405162461bcd60e51b8152600401610264906116c3565b600180546002919060ff19168183610503565b33610cfe816108db565b610d1a5760405162461bcd60e51b8152600401610264906116c3565b336000610d2682610455565b90506000811215610d495760405162461bcd60e51b8152600401610264906118b3565b600284604051610d599190611739565b602060405180830381855afa158015610d76573d6000803e3d6000fd5b5050506040513d601f19601f82011682018060405250810190610d999190611755565b60008281548110610dac57610dac6116fa565b90600052602060002090600402016002018190555050505050565b600080610dd384610455565b90506000811215610df65760405162461bcd60e51b8152600401610264906118b3565b600283604051610e069190611739565b602060405180830381855afa158015610e23573d6000803e3d6000fd5b5050506040513d601f19601f82011682018060405250810190610e469190611755565b60008281548110610e5957610e596116fa565b9060005260206000209060040201600201541491505092915050565b60405163fc09a9e560e01b81526d7065726d69736f5f6d6178696d6f60901b6004820181905290339060009073__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__9063fc09a9e590602401600060405180830381865af4158015610edd573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f19168201604052610f0591908101906118e3565b9050610f118284610943565b81604051602001610f22919061195a565b60405160208183030381529060405290610f4f5760405162461bcd60e51b815260040161026491906119c5565b506000610f5b85610455565b90506000811215610f7e5760405162461bcd60e51b8152600401610264906118b3565b60008054610f8e90600190611a95565b81548110610f9e57610f9e6116fa565b906000526020600020906004020160008281548110610fbf57610fbf6116fa565b60009182526020909120825460049092020180546001600160a01b0319166001600160a01b0390921691909117815560018082019061100090840182611aa8565b506002820154816002015560038201816003019080546110219291906110d5565b50905050600080548061103657611036611b83565b60008281526020812060046000199093019283020180546001600160a01b0319168155906110676001830182611115565b600282016000905560038201600061107f9190611152565b505090555050505050565b8280548282559060005260206000209081019282156110c5579160200282015b828111156110c55782518255916020019190600101906110aa565b506110d192915061116c565b5090565b8280548282559060005260206000209081019282156110c55760005260206000209182015b828111156110c55782548255916001019190600101906110fa565b5080546111219061176e565b6000825580601f10611131575050565b601f01602090049060005260206000209081019061114f919061116c565b50565b508054600082559060005260206000209081019061114f91905b5b808211156110d1576000815560010161116d565b80356001600160a01b038116811461119857600080fd5b919050565b634e487b7160e01b600052604160045260246000fd5b6040516080810167ffffffffffffffff811182821017156111d6576111d661119d565b60405290565b604051601f8201601f1916810167ffffffffffffffff811182821017156112055761120561119d565b604052919050565b600067ffffffffffffffff8211156112275761122761119d565b50601f01601f191660200190565b600082601f83011261124657600080fd5b81356112596112548261120d565b6111dc565b81815284602083860101111561126e57600080fd5b816020850160208301376000918101602001919091529392505050565b600082601f83011261129c57600080fd5b8135602067ffffffffffffffff8211156112b8576112b861119d565b8160051b6112c78282016111dc565b92835284810182019282810190878511156112e157600080fd5b83870192505b84831015611300578235825291830191908301906112e7565b979650505050505050565b6000806000806080858703121561132157600080fd5b61132a85611181565b9350602085013567ffffffffffffffff8082111561134757600080fd5b61135388838901611235565b9450604087013591508082111561136957600080fd5b61137588838901611235565b9350606087013591508082111561138b57600080fd5b506113988782880161128b565b91505092959194509250565b6000602082840312156113b657600080fd5b6113bf82611181565b9392505050565b60005b838110156113e15781810151838201526020016113c9565b50506000910152565b600081518084526114028160208601602086016113c6565b601f01601f19169290920160200192915050565b602080825282516001600160a01b03168282015282810151608060408401526000919061144660a08501826113ea565b6040860151606086810191909152860151858203601f19016080870152805180835290840192506000918401905b808310156114945783518252928401926001929092019190840190611474565b509695505050505050565b600080604083850312156114b257600080fd5b823567ffffffffffffffff8111156114c957600080fd5b6114d585828601611235565b9250506114e460208401611181565b90509250929050565b602081016003831061150f57634e487b7160e01b600052602160045260246000fd5b91905290565b6000806040838503121561152857600080fd5b61153183611181565b946020939093013593505050565b60006020828403121561155157600080fd5b813567ffffffffffffffff8082111561156957600080fd5b908301906080828603121561157d57600080fd5b6115856111b3565b61158e83611181565b81526020830135828111156115a257600080fd5b6115ae87828601611235565b602083015250604083013560408201526060830135828111156115d057600080fd5b6115dc8782860161128b565b60608301525095945050505050565b6000602082840312156115fd57600080fd5b5035919050565b6001600160a01b0384168152606060208201819052600090611628908301856113ea565b9050826040830152949350505050565b60006020828403121561164a57600080fd5b813567ffffffffffffffff81111561166157600080fd5b61166d84828501611235565b949350505050565b6000806040838503121561168857600080fd5b61169183611181565b9150602083013567ffffffffffffffff8111156116ad57600080fd5b6116b985828601611235565b9150509250929050565b60208082526019908201527f5573756172696f206e6f2061646d696e6973747261646f722e00000000000000604082015260600190565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b808201808211156109f2576109f2611710565b6000825161174b8184602087016113c6565b9190910192915050565b60006020828403121561176757600080fd5b5051919050565b600181811c9082168061178257607f821691505b6020821081036117a257634e487b7160e01b600052602260045260246000fd5b50919050565b601f8211156117ee57600081815260208120601f850160051c810160208610156117cf5750805b601f850160051c820191505b81811015610bb4578281556001016117db565b505050565b815167ffffffffffffffff81111561180d5761180d61119d565b6118218161181b845461176e565b846117a8565b602080601f831160018114611856576000841561183e5750858301515b600019600386901b1c1916600185901b178555610bb4565b600085815260208120601f198616915b8281101561188557888601518255948401946001909101908401611866565b50858210156118a35787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b602080825260169082015275022b6103ab9bab0b934b79037379032bc34b9ba3297160551b604082015260600190565b6000602082840312156118f557600080fd5b815167ffffffffffffffff81111561190c57600080fd5b8201601f8101841361191d57600080fd5b805161192b6112548261120d565b81815285602083850101111561194057600080fd5b6119518260208301602086016113c6565b95945050505050565b7f5573756172696f206e6f2061646d696e6973747261646f72206f206e6f20746981527f656e6520656c207065726d69736f20736f6c6963697461646f3a2000000000006020820152600082516119b881603b8501602087016113c6565b91909101603b0192915050565b6020815260006113bf60208301846113ea565b6040815260006119eb60408301856113ea565b60208382038185015260008554611a018161176e565b80855260018281168015611a1c5760018114611a3657611a64565b60ff1984168787015282151560051b870186019450611a64565b896000528560002060005b84811015611a5c578154898201890152908301908701611a41565b880187019550505b50929998505050505050505050565b600060208284031215611a8557600080fd5b815180151581146113bf57600080fd5b818103818111156109f2576109f2611710565b818103611ab3575050565b611abd825461176e565b67ffffffffffffffff811115611ad557611ad561119d565b611ae38161181b845461176e565b6000601f821160018114611b175760008315611aff5750848201545b600019600385901b1c1916600184901b178455611b7c565b600085815260209020601f19841690600086815260209020845b83811015611b515782860154825560019586019590910190602001611b31565b5085831015611b6f5781850154600019600388901b60f8161c191681555b50505060018360011b0184555b5050505050565b634e487b7160e01b600052603160045260246000fdfea26469706673582212205ed991dc9ad77d3375cdebfd94551986251415e4ada657768f480db399e2a18a64736f6c63430008110033";

    public static final String FUNC_ACL_ARRAY = "acl_array";

    public static final String FUNC_ACTIVAR = "activar";

    public static final String FUNC_ACTUALIZAR_ADMINISTRADOR_CLAVE = "actualizar_administrador_clave";

    public static final String FUNC_ACTUALIZAR_ADMINISTRADOR_PERO_NO_CLAVE = "actualizar_administrador_pero_no_clave";

    public static final String FUNC_BORRAR_ADMINISTRADOR = "borrar_administrador";

    public static final String FUNC_CAMBIAR_DIRECCION = "cambiar_direccion";

    public static final String FUNC_COMPROBAR_CLAVE = "comprobar_clave";

    public static final String FUNC_CREAR_ADMINISTRADOR = "crear_administrador";

    public static final String FUNC_ESTADO = "estado";

    public static final String FUNC_INACTIVAR = "inactivar";

    public static final String FUNC_LEER_ADMINISTRADOR = "leer_administrador";

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

    public RemoteFunctionCall<TransactionReceipt> actualizar_administrador_clave(byte[] clave) {
        final Function function = new Function(
                FUNC_ACTUALIZAR_ADMINISTRADOR_CLAVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(clave)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> actualizar_administrador_pero_no_clave(acls acl) {
        final Function function = new Function(
                FUNC_ACTUALIZAR_ADMINISTRADOR_PERO_NO_CLAVE, 
                Arrays.<Type>asList(acl), 
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

    public RemoteFunctionCall<acls> leer_administrador(String direccion) {
        final Function function = new Function(FUNC_LEER_ADMINISTRADOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, direccion)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<acls>() {}));
        return executeRemoteCallSingleValueReturn(function, acls.class);
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