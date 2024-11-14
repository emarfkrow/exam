/**
 * エンティティ４グリッド定義
 */

let TEntity4GridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity4Grid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['TEntity4Grid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['TEntity4Grid.entityBn'], 150, 'primaryKey numbering', null),
    Column.text('ENTITY4_MEI', Messages['TEntity4Grid.entity4Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntity4Grid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity4Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity4Grid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity4Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntity4Grid.deleteF'], 30, ''),
];
