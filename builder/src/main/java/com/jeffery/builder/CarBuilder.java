package com.jeffery.builder;

/**
 * @author jeffery.yi
 * @since 12-12-2020
 */
// 抽象建造者
interface CarBuilder {
  Car build();

  CarBuilder setWheels(int wheels);

  CarBuilder setColor(String color);
}

// 具体建造者
class CarBuilderImpl implements CarBuilder {
  private Car car;

  public CarBuilderImpl() {
    this.car = new Car();
  }

  @Override
  public Car build() {
    return car;
  }

  @Override
  public CarBuilder setWheels(int wheels) {
    car.setWheels(wheels);
    // 注意这里返回的是this对象，就是对象本身
    // 这样的话就可以在Director使用类似链式调用连续调用这个对象的所有方法
    return this;
  }

  @Override
  public CarBuilder setColor(String color) {
    car.setColor(color);
    return this;
  }
}