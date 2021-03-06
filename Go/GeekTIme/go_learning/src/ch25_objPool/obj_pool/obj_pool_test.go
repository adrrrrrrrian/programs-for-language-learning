package obj_pool

import (
	"fmt"
	"testing"
	"time"
)

func TestObjPool(t *testing.T) {
	pool := NewObjPool(10)

	for i := 0; i < 11; i++ {
		if v, err := pool.GetObj(time.Second * 1); err != nil {
			t.Error(err)
		} else {
			fmt.Printf("%T\n", v)
			// if we don't do below, at the 11th time we will see timeout
			if err := pool.ReleaseObj(v); err != nil {
				t.Error(err)
			}
		}
	}
}
