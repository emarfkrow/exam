/**
 * エンティティ５グリッド定義
 */

let TEntity5GridColumns = [
    Column.refer('SOSEN_ID', Messages['TEntity5Grid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['TEntity5Grid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['TEntity5Grid.entityBn'], 150, 'primaryKey numbering', null),
    Column.text('ENTITY5_MEI', Messages['TEntity5Grid.entity5Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntity5Grid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntity5Grid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntity5Grid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntity5Grid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntity5Grid.deleteF'], 30, ''),
];
