/**
 * エンティティ２グリッド定義
 */

let TEntity2GridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity2Grid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['TEntity2Grid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['TEntity2Grid.entityBn'], 150, 'primaryKey numbering', null),
    Column.text('ENTITY2_MEI', Messages['TEntity2Grid.entity2Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntity2Grid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity2Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity2Grid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity2Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntity2Grid.deleteF'], 30, ''),
];
