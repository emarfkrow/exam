/**
 * エンティティ３グリッド定義
 */

let TEntity3GridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity3Grid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['TEntity3Grid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['TEntity3Grid.entityBn'], 150, 'primaryKey numbering', null),
    Column.text('ENTITY3_MEI', Messages['TEntity3Grid.entity3Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntity3Grid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity3Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity3Grid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity3Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntity3Grid.deleteF'], 30, ''),
];
