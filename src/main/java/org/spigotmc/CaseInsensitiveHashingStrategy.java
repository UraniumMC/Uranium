package org.spigotmc;

import gnu.trove.strategy.HashingStrategy;

class CaseInsensitiveHashingStrategy implements HashingStrategy<String> {
	private static final long serialVersionUID = -9212222772914758878L;
	static final CaseInsensitiveHashingStrategy INSTANCE = new CaseInsensitiveHashingStrategy();

    @Override
    public int computeHashCode(String object) {
        return object.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(String o1, String o2) {
        return o1.equalsIgnoreCase(o2);
    }
}