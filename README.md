<?xml version="1.0" encoding="UTF-8"?>

<ClassDiagram name="miapp">
  <ClassDiagramComponents>
    <Class name="Libreta" package="miapp" visibility="public" xPosition="9.0" yPosition="129.0">
      <Fields>
        <Field name="arrayContactos" type="Contacto[]" visibility="public"/>
        <Field name="propietario" type="String" visibility="private"/>
        <Field name="dni" type="String" visibility="private"/>
      </Fields>
      <Constructors>
        <Constructor visibility="public"/>
        <Constructor visibility="public">
          <Argument type="String" name="propietario"/>
          <Argument type="String" name="dni"/>
        </Constructor>
      </Constructors>
      <Methods>
        <Method name="getPropietario" returnType="String" visibility="public"/>
        <Method name="setPropietario" returnType="String" visibility="public">
          <Argument type="String" name="propietario"/>
        </Method>
        <Method name="getDni" returnType="String" visibility="public"/>
        <Method name="setDni" returnType="String" visibility="public">
          <Argument type="String" name="dni"/>
        </Method>
        <Method name="pedirNome" returnType="Contacto" visibility="public">
          <Argument type="Contacto" name="contacto"/>
        </Method>
        <Method name="engadir" returnType="void" visibility="public"/>
        <Method name="listar" returnType="void" visibility="public"/>
        <Method name="cualLibre" returnType="int" visibility="public"/>
        <Method name="engadirGrupo" returnType="void" visibility="public"/>
        <Method name="pedirDatos" returnType="void" visibility="public"/>
        <Method name="listarGrupo" returnType="void" visibility="public"/>
        <Method name="borrarGrupo" returnType="void" visibility="public"/>
      </Methods>
    </Class>
    <Class name="Contacto" package="miapp" visibility="public" xPosition="737.0" yPosition="84.0">
      <Fields>
        <Field name="nombre" type="String" visibility="private"/>
        <Field name="apellidos" type="String" visibility="private"/>
        <Field name="telefono" type="String" visibility="private"/>
        <Field name="correoElec" type="String" visibility="private"/>
        <Field name="id" type="int" visibility="private"/>
      </Fields>
      <Constructors>
        <Constructor visibility="public"/>
        <Constructor visibility="public">
          <Argument type="String" name="nombre"/>
          <Argument type="String" name="apellidos"/>
          <Argument type="String" name="telefono"/>
          <Argument type="String" name="correoElec"/>
          <Argument type="int" name="id"/>
        </Constructor>
      </Constructors>
      <Methods>
        <Method name="getNombre" returnType="String" visibility="public"/>
        <Method name="setNombre" returnType="String" visibility="public">
          <Argument type="String" name="nombre"/>
        </Method>
        <Method name="getApellidos" returnType="String" visibility="public"/>
        <Method name="setApellidos" returnType="String" visibility="public">
          <Argument type="String" name="apellidos"/>
        </Method>
        <Method name="getTelefono" returnType="String" visibility="public"/>
        <Method name="setTelefono" returnType="String" visibility="public">
          <Argument type="String" name="telefono"/>
        </Method>
        <Method name="getCorreoElec" returnType="String" visibility="public"/>
        <Method name="setCorreoElec" returnType="String" visibility="public">
          <Argument type="String" name="correoElec"/>
        </Method>
        <Method name="getId" returnType="int" visibility="public"/>
        <Method name="setId" returnType="int" visibility="public">
          <Argument type="int" name="id"/>
        </Method>
        <Method name="toString" returnType="String" visibility="public"/>
      </Methods>
    </Class>
    <Class name="MiApp" package="miapp" visibility="public" xPosition="35.0" yPosition="20.0">
      <Fields/>
      <Constructors/>
      <Methods>
        <Method name="main" returnType="String[]" visibility="public" isStatic="true">
          <Argument type="String[]" name="args"/>
        </Method>
      </Methods>
    </Class>
    <Class name="Grupo" package="" visibility="public" xPosition="434.0" yPosition="266.0">
      <Fields>
        <Field name="nombreGrup" type="String" visibility="private"/>
        <Field name="arrayContacto" type="Contacto[]" visibility="public"/>
      </Fields>
      <Constructors>
        <Constructor visibility="public"/>
      </Constructors>
      <Methods>
        <Method name="engadirContactoGrupo" returnType="void" visibility="public"/>
        <Method name="buscarContactoGrupo" returnType="void" visibility="public"/>
        <Method name="getNombreGrup" returnType="String" visibility="public"/>
        <Method name="setNombre" returnType="String" visibility="public">
          <Argument type="String" name="nombreGrup"/>
        </Method>
        <Method name="listarContactoGrupo" returnType="void" visibility="public"/>
      </Methods>
    </Class>
    <Class name="Usuario" package="" visibility="public" xPosition="445.0" yPosition="589.0">
      <Fields>
        <Field name="usuario" type="String" visibility="private"/>
        <Field name="pass" type="String" visibility="private"/>
        <Field name="libreta" type="Libreta" visibility="private"/>
      </Fields>
      <Constructors>
        <Constructor visibility="public"/>
      </Constructors>
      <Methods>
        <Method name="getUsuario" returnType="void" visibility="public"/>
        <Method name="getPass" returnType="void" visibility="public"/>
        <Method name="setUsuario" returnType="void" visibility="public"/>
        <Method name="setPass" returnType="void" visibility="public"/>
        <Method name="engadirLibreta" returnType="void" visibility="public"/>
        <Method name="borrarLibreta" returnType="void" visibility="public"/>
        <Method name="editarLibreta" returnType="void" visibility="public"/>
        <Method name="exportarLibreta" returnType="void" visibility="public"/>
      </Methods>
    </Class>
  </ClassDiagramComponents>
  <ClassDiagramRelations>
    <HasRelation name="contacto1" source="miapp.Libreta" target="miapp.Contacto" type="Aggregation" sourceCardinality="1..1" targetCardinality="1..1"/>
    <UseRelation name="" source="Grupo" target="miapp.Contacto" sourceCardinality="1..1" targetCardinality="1..*"/>
    <UseRelation source="miapp.Libreta" target="miapp.Contacto" sourceCardinality="1..1" targetCardinality="1..1"/>
    <UseRelation name="" source="miapp.Libreta" target="Usuario" sourceCardinality="1..1" targetCardinality="1..1"/>
    <UseRelation name="" source="miapp.Libreta" target="Grupo" sourceCardinality="1..1" targetCardinality="1..*"/>
  </ClassDiagramRelations>
</ClassDiagram>
