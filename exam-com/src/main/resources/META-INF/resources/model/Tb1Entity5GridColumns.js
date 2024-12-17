/**
 * エンティティ５グリッド定義
 */

let Tb1Entity5GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity5Grid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1Entity5Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity5Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY5_MEI', Messages['Tb1Entity5Grid.entity5Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1Entity5Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1Entity5Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1Entity5Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1Entity5Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1Entity5Grid.deleteF'], 30, ''),
];
