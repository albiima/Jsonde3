package com.jsonde.profiler.heap;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/**
 * 
 * @author admin
 *
 */
public class HeapAnalyzerReference extends WeakReference<Object> {

    private final long constructorId;
    private final long objectSize;

    /**
     * 
     * @param referent
     * @param q
     * @param constructorId
     * @param objectSize
     */
    public HeapAnalyzerReference(Object referent, ReferenceQueue<Object> q, long constructorId, long objectSize) {
        super(referent, q);
        this.constructorId = constructorId;
        this.objectSize = objectSize;
    }

    public long getConstructorId() {
        return constructorId;
    }

    public long getObjectSize() {
        return objectSize;
    }

}
