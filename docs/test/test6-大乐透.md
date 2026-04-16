# test6 大乐透 - 项目总结

## 📋 项目思路

### 核心功能
模拟中国体育彩票"大乐透"游戏，实现号码生成、用户选号、中奖判断三大功能。

### 游戏规则
- **前区**：1-35 选 5 个不重复号码
- **后区**：1-12 选 2 个不重复号码
- **跨区可重复**：前后区号码可以相同

### 中奖等级
| 等级 | 条件 |
|------|------|
| 一等奖 | 5+2 |
| 二等奖 | 5+1 |
| 三等奖 | 5+0 或 4+2 |
| 四等奖 | 4+1 或 3+2 |
| 五等奖 | 4+0 或 3+1 或 2+2 |
| 六等奖 | 3+0 或 1+2 或 2+1 或 0+2 |

### 架构设计
```
main() 主流程
  ├─ randomArray()    → 生成随机号码
  ├─ inputArray()     → 接收用户输入
  ├─ printArray()     → 格式化输出
  └─ countSame()      → 计算重合数量
       └─ isRepeat()  → 判断数字是否重复（工具方法）
```

---

## 🔧 优化历程

### 优化 1：提取公共方法 `isRepeat()`

**问题**：重复检测逻辑在多处出现，代码冗余

**优化前**：
```java
// randomArray 中
for (int j = 0; j < i; j++) {
    if (randex == arr[j]) { flag = false; break; }
}

// inputArray 中
for (int j = 0; j < i; j++) {
    if (input == arr[j]) { flag = false; break; }
}
```

**优化后**：
```java
public static boolean isRepeat(int[] arr, int number) {
    for (int i = 0; i < arr.length; i++) {
        if (number == arr[i]) {
            return true;
        }
    }
    return false;
}
```

**收益**：
- ✅ 消除重复代码
- ✅ 提高可维护性
- ✅ 统一判断逻辑

---

### 优化 2：修复 `randomArray` 逻辑

**问题**：先检查再赋值，但此时数组元素为默认值 0

**优化前**：
```java
for (int i = 0; i < arr.length; i++) {
    int randex = r.nextInt(size) + 1;
    boolean flag = isRepeat(arr, i);  // ❌ 检查索引而非数值
    if (!flag) {
        arr[i] = randex;
    } else {
        i--;
    }
}
```

**优化后**：
```java
for (int i = 0; i < arr.length; ) {
    int randex = RANDOM.nextInt(size) + 1;
    boolean flag = isRepeat(arr, randex);  // ✓ 检查随机数
    if (!flag) {
        arr[i] = randex;
        i++;  // ✓ 成功才递增
    }
}
```

**收益**：
- ✅ 修复逻辑错误
- ✅ 简化循环控制
- ✅ 使用静态常量

---

### 优化 3：简化 `countSame` 实现

**问题**：双重循环效率低，代码冗长

**优化前**：
```java
public static int countSame(int[] arr1, int[] arr2) {
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                count++;
            }
        }
    }
    return count;
}
```

**优化后**：
```java
public static int countSame(int[] arr1, int[] arr2) {
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
        if (isRepeat(arr2, arr1[i])) {  // ✓ 复用工具方法
            count++;
        }
    }
    return count;
}
```

**收益**：
- ✅ 代码更简洁
- ✅ 复用已有方法
- ✅ 降低嵌套层级

---

### 优化 4：添加静态常量 `RANDOM`

**问题**：每次调用都创建新的 Random 对象

**优化前**：
```java
public static void randomArray(int[] arr, int size) {
    Random r = new Random();  // ❌ 重复创建
    // ...
}
```

**优化后**：
```java
private static final Random RANDOM = new Random();  // ✓ 类级别常量

public static void randomArray(int[] arr, int size) {
    int randex = RANDOM.nextInt(size) + 1;  // ✓ 直接使用
    // ...
}
```

**收益**：
- ✅ 避免对象重复创建
- ✅ 提高随机数质量
- ✅ 符合最佳实践

---

## 📊 优化对比

| 优化项 | 优化前 | 优化后 | 效果 |
|--------|--------|--------|------|
| 重复检测 | 分散在各方法 | 独立 `isRepeat()` | 代码复用 ↑ |
| randomArray | 逻辑错误 | 正确且简洁 | Bug 修复 ✓ |
| countSame | 双重循环 | 调用工具方法 | 可读性 ↑ |
| Random 对象 | 每次新建 | 静态常量 | 性能 ↑ |

---

## 💡 核心收获

1. **方法提取**：识别重复逻辑，封装为独立方法
2. **逻辑修正**：理解变量生命周期，避免访问未赋值数据
3. **代码复用**：善用已有方法，减少重复实现
4. **资源管理**：使用静态常量避免不必要的对象创建

---

**最后更新**：2026-04-16
