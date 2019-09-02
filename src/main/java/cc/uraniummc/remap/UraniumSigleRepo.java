package cc.uraniummc.remap;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

import net.md_5.specialsource.repo.CachingRepo;
import net.md_5.specialsource.repo.RuntimeRepo;

public class UraniumSigleRepo extends CachingRepo {

    private static final RuntimeRepo instance = RuntimeRepo.getInstance();

    protected final String mOwner;
    protected final byte[] mByteCode;

    public UraniumSigleRepo(String pOwner, byte[] pByteCode) {
        this.mOwner = pOwner.replace('.', '/');
        this.mByteCode = pByteCode;
    }

    @Override
    protected ClassNode findClass0(String pOwner) {
        ClassReader tCR;
        if (pOwner.equals(this.mOwner)) {
            tCR=new ClassReader(this.mByteCode);
        } else {
            try {
                tCR = new ClassReader(pOwner);
            } catch (Exception ex) {
                return null;
            }
        }
        ClassNode node = new ClassNode();
        tCR.accept(node, 0);
        return node;
    }

}
