// ex.10.1D blockchainmain3.java

public class BlockChainMain3 {
  public static ArrayList<Block> blockchain = new ArrayList<Block>();
  public static int difficulty = 5;

  public static void main(String[] args) {
    Block b = new Block(0,null,"my first block");
    b.mineBlock(difficulty);
    blockchain.add(b);
    System.out.println(b.toString());

    Block b2 = new Block(1, b.currentHash, "my second block);
    b2.mineBlock(difficulty);
    blockchain.add(b2);
    System.out.println(b2.toString());
    System.out.println("current chain valid: " + validateChain(blockchain));
  }

  public static boolean validateChain(ArrayList<Block> blockchain) {
    if (!validateBlock(blockchain.get(0),null)){
      return false;
    }
    for(int i = 1; i < blockchain.size(); i++) {
      Block currentBlock = blockchain.get(i);
      Block previousBlock = blockchain.get(i - 1);
      if(!validateBlock(currentBlock, previousBlock) {
        return false;
      }
    }
    return true;
  }
  public static boolean validateBlock(Block newBlock, Block previousBlock){
    //same code as before
  }
}
