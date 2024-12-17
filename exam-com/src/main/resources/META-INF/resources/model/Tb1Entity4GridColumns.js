/**
 * エンティティ４グリッド定義
 */

let Tb1Entity4GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity4Grid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1Entity4Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity4Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY4_MEI', Messages['Tb1Entity4Grid.entity4Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1Entity4Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1Entity4Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1Entity4Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1Entity4Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1Entity4Grid.deleteF'], 30, ''),
];
