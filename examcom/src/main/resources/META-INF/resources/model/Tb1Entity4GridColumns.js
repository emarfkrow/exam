/**
 * エンティティ４グリッド定義
 */

let Tb1Entity4GridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1Entity4Grid.sosenId'], 80, 'primaryKey numbering', null),
    Column.comma('OYA_BN', Messages['Tb1Entity4Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity4Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY4_MEI', Messages['Tb1Entity4Grid.entity4Mei'], 300, 'notblank', null),
    Column.cell('UPDATE_TS', Messages['Tb1Entity4Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.check('DELETE_F', Messages['Tb1Entity4Grid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb1Entity4Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
