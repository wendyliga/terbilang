# Terbilang
[![Download](https://api.bintray.com/packages/wendyliga/maven/terbilang/images/download.svg)](https://bintray.com/wendyliga/maven/terbilang/_latestVersion)

Terbilang is a simple library that add a feature to show "Angka Terbilang" on your Android Application/Java

## Prerequisites

### Gradle

```
repositories {
  jcenter()
}

dependencies {
  implementation 'com.wendyliga:terbilang:0.1'
}
```

### Maven 

```
<dependency>
  <groupId>com.wendyliga</groupId>
  <artifactId>terbilang</artifactId>
  <version>0.0.1</version>
  <type>pom</type>
</dependency>
```

## Usage

```
String terbilang = bilangan(Long number);
```

or

```
String terbilang = bilangan(int number);
```
**Note** : While using Integer variable , max number is limited to 2,147,483,647 (Integer Value Limitation)

## Lisence
```
Copyright (C) 2018 Wendy Liga

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
