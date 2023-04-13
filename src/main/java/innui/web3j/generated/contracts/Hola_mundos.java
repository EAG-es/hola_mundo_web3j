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
public class Hola_mundos extends Contract {
    public static final String BINARY = "60806040526001805460ff1916811790553480156200001d57600080fd5b5060408051608081018252606060208083018281526000848601908152838501939093523384528451808601865260048152631c9bdbdd60e21b8184015290526f726f6f745f686f6c615f6d756e646f7360801b9091528251600180825281850190945291929082810190803683375050506060820181905280516d7065726d69736f5f6d6178696d6f60901b9190600090620000be57620000be62000207565b60209081029190910181019190915260008054600181018255908052825160049091027f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563810180546001600160a01b039093166001600160a01b03199093169290921782559183015183927f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e5640190620001589082620002ac565b506040820151600282015560608201518051620001809160038401916020909101906200018a565b5050505062000378565b828054828255906000526020600020908101928215620001c8579160200282015b82811115620001c8578251825591602001919060010190620001ab565b50620001d6929150620001da565b5090565b5b80821115620001d65760008155600101620001db565b634e487b7160e01b600052604160045260246000fd5b634e487b7160e01b600052603260045260246000fd5b600181811c908216806200023257607f821691505b6020821081036200025357634e487b7160e01b600052602260045260246000fd5b50919050565b601f821115620002a757600081815260208120601f850160051c81016020861015620002825750805b601f850160051c820191505b81811015620002a3578281556001016200028e565b5050505b505050565b81516001600160401b03811115620002c857620002c8620001f1565b620002e081620002d984546200021d565b8462000259565b602080601f831160018114620003185760008415620002ff5750858301515b600019600386901b1c1916600185901b178555620002a3565b600085815260208120601f198616915b82811015620003495788860151825594840194600190910190840162000328565b5085821015620003685787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b611c9280620003886000396000f3fe608060405234801561001057600080fd5b50600436106101005760003560e01c80637e9f13cb11610097578063c49c3d0511610066578063c49c3d051461021d578063db38f49914610225578063f653ea1314610238578063f9d06c4d1461024b57600080fd5b80637e9f13cb146101cb5780638e3ee7ba146101de578063b38f9adf14610200578063b776a7a21461021557600080fd5b80634ac771e7116100d35780634ac771e7146101685780634dc464371461017b578063688e34671461019e57806379ad29d7146101b857600080fd5b80630beef324146101055780631d032d011461011a5780632dd47cac14610140578063311b509114610148575b600080fd5b6101186101133660046113b8565b61025e565b005b61012d610128366004611451565b610475565b6040519081526020015b60405180910390f35b6101186104ee565b61015b610156366004611451565b61052b565b60405161013791906114c3565b61011861017636600461154c565b6106ed565b61018e610189366004611451565b6108fb565b6040519015158152602001610137565b6001546101ab9060ff1681565b60405161013791906115b0565b61018e6101c63660046115d8565b610963565b6101186101d9366004611602565b610a18565b6101f16101ec3660046116ae565b610bdc565b604051610137939291906116c7565b610208610ca4565b60405161013791906116fb565b610118610d31565b610118610d68565b61011861023336600461170e565b610da1565b61018e61024636600461174b565b610e74565b610118610259366004611451565b610f22565b33610268816108fb565b61028d5760405162461bcd60e51b815260040161028490611799565b60405180910390fd5b6000805b6000548110156102ed57600081815481106102ae576102ae6117d0565b60009182526020909120600490910201546001600160a01b03908116908816036102db57600191506102ed565b6102e68160016117fc565b9050610291565b81156103345760405162461bcd60e51b8152602060048201526016602482015275022b6103ab9bab0b934b7903cb09032bc34b9ba3297160551b6044820152606401610284565b604080516080810182526000818301526060808201526001600160a01b038916815260208101889052905160029061036d90889061180f565b602060405180830381855afa15801561038a573d6000803e3d6000fd5b5050506040513d601f19601f820116820180604052508101906103ad919061182b565b6040820152606081018590526000805460018101825590805281517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563600490920291820180546001600160a01b0319166001600160a01b03909216919091178155602083015183927f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e564019061044290826118c9565b506040820151600282015560608201518051610468916003840191602090910190611137565b5050505050505050505050565b600080805b6000548110156104d65760008181548110610497576104976117d0565b60009182526020909120600490910201546001600160a01b03908116908516036104c457600191506104d6565b6104cf8160016117fc565b905061047a565b81156104e3579392505050565b506000199392505050565b336104f8816108fb565b6105145760405162461bcd60e51b815260040161028490611799565b600180546000919060ff191681835b021790555050565b6040805160808101825260008082526060602083018190529282015281810191909152600061055983610475565b9050600081121561057c5760405162461bcd60e51b815260040161028490611989565b6040805160808101825260008082526060602083018190529282015281810191909152600082815481106105b2576105b26117d0565b6000918252602091829020604080516080810190915260049092020180546001600160a01b0316825260018101805492939192918401916105f290611844565b80601f016020809104026020016040519081016040528092919081815260200182805461061e90611844565b801561066b5780601f106106405761010080835404028352916020019161066b565b820191906000526020600020905b81548152906001019060200180831161064e57829003601f168201915b5050505050815260200160028201548152602001600382018054806020026020016040519081016040528092919081815260200182805480156106cd57602002820191906000526020600020905b8154815260200190600101908083116106b9575b50505091909252505064151515151560d91b604083015250949350505050565b60405163fc09a9e560e01b81526d7065726d69736f5f6d6178696d6f60901b6004820181905290339060009073__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__9063fc09a9e590602401600060405180830381865af4158015610755573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f1916820160405261077d91908101906119b9565b90506107898284610963565b8160405160200161079a9190611a30565b604051602081830303815290604052906107c75760405162461bcd60e51b815260040161028491906116fb565b506000805b6000548110156108935773__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__6376332c2d8860008481548110610804576108046117d0565b90600052602060002090600402016001016040518363ffffffff1660e01b8152600401610832929190611a9b565b602060405180830381865af415801561084f573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906108739190611b36565b156108815760019150610893565b61088c8160016117fc565b90506107cc565b816108b05760405162461bcd60e51b815260040161028490611989565b85600082815481106108c4576108c46117d0565b6000918252602090912060049091020180546001600160a01b0319166001600160a01b039290921691909117905550505050505050565b600080805b60005481101561095c576000818154811061091d5761091d6117d0565b60009182526020909120600490910201546001600160a01b039081169085160361094a576001915061095c565b6109558160016117fc565b9050610900565b5092915050565b6000808061097085610475565b9050600080808312610a0b575081905060005b60008281548110610996576109966117d0565b906000526020600020906004020160030180549050811015610a0b5785600083815481106109c6576109c66117d0565b906000526020600020906004020160030182815481106109e8576109e86117d0565b90600052602060002001540315610a0b57610a048160016117fc565b9050610983565b5091925050505b92915050565b33610a22816108fb565b610a3e5760405162461bcd60e51b815260040161028490611799565b81516000610a4b82610475565b90506000811215610a6e5760405162461bcd60e51b815260040161028490611989565b60005b846060015151811015610b62576d7065726d69736f5f6d6178696d6f60901b85606001518281518110610aa657610aa66117d0565b602002602001015103610b5057610ace336d7065726d69736f5f6d6178696d6f60901b610963565b610b4b5760405162461bcd60e51b815260206004820152604260248201527f4e6f20707565646520706f6e657220656c207065726d69736f206dc3a178696d60448201527f6f3b20736920717569656e206c6f20706964652c206e6f206c6f20706f736565606482015261017160f51b608482015260a401610284565b610b62565b610b5b8160016117fc565b9050610a71565b846060015160008281548110610b7a57610b7a6117d0565b90600052602060002090600402016003019080519060200190610b9e929190611137565b50846020015160008281548110610bb757610bb76117d0565b90600052602060002090600402016001019081610bd491906118c9565b505050505050565b60008181548110610bec57600080fd5b6000918252602090912060049091020180546001820180546001600160a01b03909216935090610c1b90611844565b80601f0160208091040260200160405190810160405280929190818152602001828054610c4790611844565b8015610c945780601f10610c6957610100808354040283529160200191610c94565b820191906000526020600020905b815481529060010190602001808311610c7757829003601f168201915b5050505050908060020154905083565b6060600060015460ff166002811115610cbf57610cbf61159a565b14610d0c5760405162461bcd60e51b815260206004820152601c60248201527f456c20636f6e747261746f206e6f20657374c3a12061637469766f2e000000006044820152606401610284565b5060408051808201909152600a815269486f6c61206d756e646f60b01b602082015290565b33610d3b816108fb565b610d575760405162461bcd60e51b815260040161028490611799565b60018054819060ff19168180610523565b33610d72816108fb565b610d8e5760405162461bcd60e51b815260040161028490611799565b600180546002919060ff19168183610523565b33610dab816108fb565b610dc75760405162461bcd60e51b815260040161028490611799565b336000610dd382610475565b90506000811215610df65760405162461bcd60e51b815260040161028490611989565b600284604051610e06919061180f565b602060405180830381855afa158015610e23573d6000803e3d6000fd5b5050506040513d601f19601f82011682018060405250810190610e46919061182b565b60008281548110610e5957610e596117d0565b90600052602060002090600402016002018190555050505050565b600080610e8084610475565b90506000811215610ea35760405162461bcd60e51b815260040161028490611989565b600283604051610eb3919061180f565b602060405180830381855afa158015610ed0573d6000803e3d6000fd5b5050506040513d601f19601f82011682018060405250810190610ef3919061182b565b60008281548110610f0657610f066117d0565b9060005260206000209060040201600201541491505092915050565b60405163fc09a9e560e01b81526d7065726d69736f5f6d6178696d6f60901b6004820181905290339060009073__$7ec7f4c52dcf223f6588a2b806fc4fdb5b$__9063fc09a9e590602401600060405180830381865af4158015610f8a573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f19168201604052610fb291908101906119b9565b9050610fbe8284610963565b81604051602001610fcf9190611a30565b60405160208183030381529060405290610ffc5760405162461bcd60e51b815260040161028491906116fb565b50600061100885610475565b9050600081121561102b5760405162461bcd60e51b815260040161028490611989565b6000805461103b90600190611b58565b8154811061104b5761104b6117d0565b90600052602060002090600402016000828154811061106c5761106c6117d0565b60009182526020909120825460049092020180546001600160a01b0319166001600160a01b039092169190911781556001808201906110ad90840182611b6b565b506002820154816002015560038201816003019080546110ce929190611182565b5090505060008054806110e3576110e3611c46565b60008281526020812060046000199093019283020180546001600160a01b03191681559061111460018301826111c2565b600282016000905560038201600061112c91906111ff565b505090555050505050565b828054828255906000526020600020908101928215611172579160200282015b82811115611172578251825591602001919060010190611157565b5061117e929150611219565b5090565b8280548282559060005260206000209081019282156111725760005260206000209182015b828111156111725782548255916001019190600101906111a7565b5080546111ce90611844565b6000825580601f106111de575050565b601f0160209004906000526020600020908101906111fc9190611219565b50565b50805460008255906000526020600020908101906111fc91905b5b8082111561117e576000815560010161121a565b80356001600160a01b038116811461124557600080fd5b919050565b634e487b7160e01b600052604160045260246000fd5b6040516080810167ffffffffffffffff811182821017156112835761128361124a565b60405290565b604051601f8201601f1916810167ffffffffffffffff811182821017156112b2576112b261124a565b604052919050565b600067ffffffffffffffff8211156112d4576112d461124a565b50601f01601f191660200190565b600082601f8301126112f357600080fd5b8135611306611301826112ba565b611289565b81815284602083860101111561131b57600080fd5b816020850160208301376000918101602001919091529392505050565b600082601f83011261134957600080fd5b8135602067ffffffffffffffff8211156113655761136561124a565b8160051b611374828201611289565b928352848101820192828101908785111561138e57600080fd5b83870192505b848310156113ad57823582529183019190830190611394565b979650505050505050565b600080600080608085870312156113ce57600080fd5b6113d78561122e565b9350602085013567ffffffffffffffff808211156113f457600080fd5b611400888389016112e2565b9450604087013591508082111561141657600080fd5b611422888389016112e2565b9350606087013591508082111561143857600080fd5b5061144587828801611338565b91505092959194509250565b60006020828403121561146357600080fd5b61146c8261122e565b9392505050565b60005b8381101561148e578181015183820152602001611476565b50506000910152565b600081518084526114af816020860160208601611473565b601f01601f19169290920160200192915050565b602080825282516001600160a01b0316828201528281015160806040840152600091906114f360a0850182611497565b6040860151606086810191909152860151858203601f19016080870152805180835290840192506000918401905b808310156115415783518252928401926001929092019190840190611521565b509695505050505050565b6000806040838503121561155f57600080fd5b823567ffffffffffffffff81111561157657600080fd5b611582858286016112e2565b9250506115916020840161122e565b90509250929050565b634e487b7160e01b600052602160045260246000fd5b60208101600383106115d257634e487b7160e01b600052602160045260246000fd5b91905290565b600080604083850312156115eb57600080fd5b6115f48361122e565b946020939093013593505050565b60006020828403121561161457600080fd5b813567ffffffffffffffff8082111561162c57600080fd5b908301906080828603121561164057600080fd5b611648611260565b6116518361122e565b815260208301358281111561166557600080fd5b611671878286016112e2565b6020830152506040830135604082015260608301358281111561169357600080fd5b61169f87828601611338565b60608301525095945050505050565b6000602082840312156116c057600080fd5b5035919050565b6001600160a01b03841681526060602082018190526000906116eb90830185611497565b9050826040830152949350505050565b60208152600061146c6020830184611497565b60006020828403121561172057600080fd5b813567ffffffffffffffff81111561173757600080fd5b611743848285016112e2565b949350505050565b6000806040838503121561175e57600080fd5b6117678361122e565b9150602083013567ffffffffffffffff81111561178357600080fd5b61178f858286016112e2565b9150509250929050565b60208082526019908201527f5573756172696f206e6f2061646d696e6973747261646f722e00000000000000604082015260600190565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b80820180821115610a1257610a126117e6565b60008251611821818460208701611473565b9190910192915050565b60006020828403121561183d57600080fd5b5051919050565b600181811c9082168061185857607f821691505b60208210810361187857634e487b7160e01b600052602260045260246000fd5b50919050565b601f8211156118c457600081815260208120601f850160051c810160208610156118a55750805b601f850160051c820191505b81811015610bd4578281556001016118b1565b505050565b815167ffffffffffffffff8111156118e3576118e361124a565b6118f7816118f18454611844565b8461187e565b602080601f83116001811461192c57600084156119145750858301515b600019600386901b1c1916600185901b178555610bd4565b600085815260208120601f198616915b8281101561195b5788860151825594840194600190910190840161193c565b50858210156119795787850151600019600388901b60f8161c191681555b5050505050600190811b01905550565b602080825260169082015275022b6103ab9bab0b934b79037379032bc34b9ba3297160551b604082015260600190565b6000602082840312156119cb57600080fd5b815167ffffffffffffffff8111156119e257600080fd5b8201601f810184136119f357600080fd5b8051611a01611301826112ba565b818152856020838501011115611a1657600080fd5b611a27826020830160208601611473565b95945050505050565b7f5573756172696f206e6f2061646d696e6973747261646f72206f206e6f20746981527f656e6520656c207065726d69736f20736f6c6963697461646f3a200000000000602082015260008251611a8e81603b850160208701611473565b91909101603b0192915050565b604081526000611aae6040830185611497565b60208382038185015260008554611ac481611844565b80855260018281168015611adf5760018114611af957611b27565b60ff1984168787015282151560051b870186019450611b27565b896000528560002060005b84811015611b1f578154898201890152908301908701611b04565b880187019550505b50929998505050505050505050565b600060208284031215611b4857600080fd5b8151801515811461146c57600080fd5b81810381811115610a1257610a126117e6565b818103611b76575050565b611b808254611844565b67ffffffffffffffff811115611b9857611b9861124a565b611ba6816118f18454611844565b6000601f821160018114611bda5760008315611bc25750848201545b600019600385901b1c1916600184901b178455611c3f565b600085815260209020601f19841690600086815260209020845b83811015611c145782860154825560019586019590910190602001611bf4565b5085831015611c325781850154600019600388901b60f8161c191681555b50505060018360011b0184555b5050505050565b634e487b7160e01b600052603160045260246000fdfea26469706673582212208de31185e773e748e6819d4db27d52bd8c27476570fc43b0fecf5ab434fa042264736f6c63430008110033";

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

    public static final String FUNC_LEER = "leer";

    public static final String FUNC_LEER_ADMINISTRADOR = "leer_administrador";

    public static final String FUNC_LEER_ADMINISTRADOR_POS = "leer_administrador_pos";

    public static final String FUNC_LIMITAR = "limitar";

    public static final String FUNC_SER_ADMINISTRADOR = "ser_administrador";

    public static final String FUNC_SER_ADMINISTRADOR_CON_PERMISO = "ser_administrador_con_permiso";

    @Deprecated
    protected Hola_mundos(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Hola_mundos(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Hola_mundos(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Hola_mundos(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
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

    public RemoteFunctionCall<String> leer() {
        final Function function = new Function(FUNC_LEER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
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
    public static Hola_mundos load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Hola_mundos(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Hola_mundos load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Hola_mundos(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Hola_mundos load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Hola_mundos(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Hola_mundos load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Hola_mundos(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Hola_mundos> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Hola_mundos.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Hola_mundos> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Hola_mundos.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Hola_mundos> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Hola_mundos.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Hola_mundos> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Hola_mundos.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
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