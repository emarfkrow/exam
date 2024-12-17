/**
 * エンティティ２グリッド定義
 */

let Tb1Entity2GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity2Grid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1Entity2Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity2Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY2_MEI', Messages['Tb1Entity2Grid.entity2Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1Entity2Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1Entity2Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1Entity2Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1Entity2Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1Entity2Grid.deleteF'], 30, ''),
];
