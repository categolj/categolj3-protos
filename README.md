# Protobuf for CategoLJ3 API

[![Build Status](https://travis-ci.org/categolj/categolj3-protos.svg)](https://travis-ci.org/categolj/categolj3-protos)

## Usage (Java)

``` xml
<dependency>
    <groupId>am.ik.categolj3</groupId>
    <artifactId>categolj3-protos</artifactId>
    <version>1.0.0.M1</version>
</dependency>
```

``` java
Entry.FrontMatter.Builder frontMatterBuilder = Entry.FrontMatter.newBuilder()
        .setTitle("Hello!");
Entry entry = Entry.newBuilder()
        .setEntryId(1L)
        .setContent("This is a sample!")
        .setCreated(Entry.Author.newBuilder()
                .setName("Toshiaki Maki")
                .setDate(new Date().getTime())
        .setUpdated(Entry.Author.newBuilder()
                .setName("Toshiaki Maki")
                .setDate(new Date().getTime())
        .setFrontMatter(frontMatterBuilder)
```

## Usage (Go)

``` console
$ go get github.com/categolj/categolj3-protos/categolj3
```

``` go
package main

import "github.com/golang/protobuf/proto"
import "github.com/categolj/categolj3-protos/categolj3"
import "fmt"

func main() {
	entry := &categolj3.Entry{
		EntryId: proto.Int64(1),
		Content: proto.String("Hi!"),
	}
	data, _ := proto.Marshal(entry)
	fmt.Println(data)
}
```