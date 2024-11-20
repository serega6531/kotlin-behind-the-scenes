package berlin.kotlin.lambda;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(
   mv = {2, 0, 0},
   k = 3,
   xi = 48,
   d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"},
   d2 = {"<anonymous>", "", "num", "", "invoke"}
)
final class CaptureKt$testAnonymousClass$a$1 extends Lambda implements Function1<Integer, Unit> {
   // $FF: synthetic field
   final int $test;

   CaptureKt$testAnonymousClass$a$1(int $test) {
      super(1);
      this.$test = $test;
   }

   public final void invoke(int num) {
      int var2 = num * this.$test;
      System.out.println(var2);
   }
}

public final class CaptureKt {
   ...

   private static final void testAnonymousClass() {
      int test = 2;
      Function1 a = (Function1)(new CaptureKt$testAnonymousClass$a$1(test));
      a.invoke(111);
   }

   ...

   private static final Unit testIndy$lambda$0(int $test, int num) {
      int var2 = num * $test;
      System.out.println(var2);
      return Unit.INSTANCE;
   }
}