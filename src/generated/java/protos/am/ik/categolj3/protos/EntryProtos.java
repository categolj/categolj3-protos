// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: am/ik/categolj3/protos/entry.proto

package am.ik.categolj3.protos;

public final class EntryProtos {
  private EntryProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_am_ik_categolj3_protos_Entry_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_am_ik_categolj3_protos_Entry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_am_ik_categolj3_protos_Entry_Author_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_am_ik_categolj3_protos_Entry_Author_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_am_ik_categolj3_protos_Entry_FrontMatter_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_am_ik_categolj3_protos_Entry_FrontMatter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_am_ik_categolj3_protos_EntryPage_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_am_ik_categolj3_protos_EntryPage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"am/ik/categolj3/protos/entry.proto\022\026am" +
      ".ik.categolj3.protos\"\275\002\n\005Entry\022\017\n\007entryI" +
      "d\030\001 \002(\003\022\017\n\007content\030\002 \001(\t\0225\n\007created\030\003 \002(" +
      "\0132$.am.ik.categolj3.protos.Entry.Author\022" +
      "5\n\007updated\030\004 \002(\0132$.am.ik.categolj3.proto" +
      "s.Entry.Author\022>\n\013frontMatter\030\005 \002(\0132).am" +
      ".ik.categolj3.protos.Entry.FrontMatter\032$" +
      "\n\006Author\022\014\n\004name\030\001 \002(\t\022\014\n\004date\030\002 \002(\003\032>\n\013" +
      "FrontMatter\022\r\n\005title\030\001 \002(\t\022\014\n\004tags\030\002 \003(\t" +
      "\022\022\n\ncategories\030\003 \003(\t\"\273\001\n\tEntryPage\022.\n\007co",
      "ntent\030\001 \003(\0132\035.am.ik.categolj3.protos.Ent" +
      "ry\022\022\n\ntotalPages\030\002 \002(\003\022\025\n\rtotalElements\030" +
      "\003 \002(\003\022\r\n\005first\030\004 \002(\010\022\014\n\004last\030\005 \002(\010\022\030\n\020nu" +
      "mberOfElements\030\006 \002(\003\022\014\n\004size\030\007 \002(\005\022\016\n\006nu" +
      "mber\030\010 \002(\005B\'\n\026am.ik.categolj3.protosB\013En" +
      "tryProtosP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_am_ik_categolj3_protos_Entry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_am_ik_categolj3_protos_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_am_ik_categolj3_protos_Entry_descriptor,
        new java.lang.String[] { "EntryId", "Content", "Created", "Updated", "FrontMatter", });
    internal_static_am_ik_categolj3_protos_Entry_Author_descriptor =
      internal_static_am_ik_categolj3_protos_Entry_descriptor.getNestedTypes().get(0);
    internal_static_am_ik_categolj3_protos_Entry_Author_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_am_ik_categolj3_protos_Entry_Author_descriptor,
        new java.lang.String[] { "Name", "Date", });
    internal_static_am_ik_categolj3_protos_Entry_FrontMatter_descriptor =
      internal_static_am_ik_categolj3_protos_Entry_descriptor.getNestedTypes().get(1);
    internal_static_am_ik_categolj3_protos_Entry_FrontMatter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_am_ik_categolj3_protos_Entry_FrontMatter_descriptor,
        new java.lang.String[] { "Title", "Tags", "Categories", });
    internal_static_am_ik_categolj3_protos_EntryPage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_am_ik_categolj3_protos_EntryPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_am_ik_categolj3_protos_EntryPage_descriptor,
        new java.lang.String[] { "Content", "TotalPages", "TotalElements", "First", "Last", "NumberOfElements", "Size", "Number", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
